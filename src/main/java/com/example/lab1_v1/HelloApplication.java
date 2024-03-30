package com.example.lab1_v1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.antlr.v4.runtime.Token;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lexical and Syntax Analyzers");

        TextArea codeTextArea = new TextArea();
        codeTextArea.setWrapText(true);

        TextArea lexicalResultTextArea = new TextArea();
        lexicalResultTextArea.setEditable(false);

        TextArea syntaxResultTextArea = new TextArea();
        syntaxResultTextArea.setEditable(false);

        TextArea symbolTableTextArea = new TextArea();
        symbolTableTextArea.setEditable(false);

        TextArea AsmResultTextArea = new TextArea();
        AsmResultTextArea.setEditable(false);

        Button analyzeButton = new Button("Analyze");
        analyzeButton.setOnAction(e -> {
            String code = codeTextArea.getText();
            java_lex lexer = new java_lex(new ANTLRInputStream(code));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            java_pars parser = new java_pars(tokens);

            StringBuilder lexicalResult = new StringBuilder();
            StringBuilder syntaxResult = new StringBuilder();

            // Создаем таблицу символов и множество использованных переменных
            HashMap<String, SymbolInfo> symbolTable = new HashMap<>();
            Set<String> usedVariables = new HashSet<>();

            java_pars.ProgramContext tree = parser.program();

            MyListener listener = new MyListener(symbolTable, usedVariables);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            symbolTable.keySet().stream()
                    .filter(var -> !usedVariables.contains(var))
                    .forEach(var -> System.err.println("Warning: Variable " + var + " declared but never used."));
            // Обработка результатов лексического анализа
            for (Token token : tokens.getTokens()) {
                String symbolicName = lexer.getVocabulary().getSymbolicName(token.getType());
                String text = token.getText();
                int line = token.getLine();
                int position = token.getCharPositionInLine();

                lexicalResult.append("Token: ").append(symbolicName)
                        .append(", Text: ").append(text)
                        .append(", Line: ").append(line)
                        .append(", Position: ").append(position)
                        .append("\n");
            }

            // Проверяем наличие ошибок синтаксического анализа
            int syntaxErrors = parser.getNumberOfSyntaxErrors();
            if (syntaxErrors > 0) {
                syntaxResult.append("Syntax errors found: ").append(syntaxErrors).append("\n");
                syntaxResultTextArea.setText(syntaxResult.toString());
                syntaxResultTextArea.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
            } else {
                syntaxResultTextArea.setText("No syntax errors found.\n");
                syntaxResultTextArea.setStyle("-fx-text-fill: green; -fx-font-weight: bold;");
            }

            StringBuilder symbolTableResult = new StringBuilder("Symbol Table:\n");
            for (String variable : symbolTable.keySet()) {
                SymbolInfo info = symbolTable.get(variable);
                symbolTableResult.append(variable).append(": Type: ").append(info.type).append(", Line: ").append(info.line).append("\n");
            }
            symbolTableTextArea.setText(symbolTableResult.toString());

            lexicalResultTextArea.setText(lexicalResult.toString());

            String assemblyCode = listener.getAssemblyCode();
            AsmResultTextArea.setText(assemblyCode);

            // Запись сгенерированного ассемблеровского кода в файл.
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.asm"))) {
                writer.write(assemblyCode);
                System.out.println("Assembly code has been saved to output.asm");
            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("Failed to save assembly code.");
            }

            ProcessBuilder nasmProcessBuilder = new ProcessBuilder("nasm", "-f", "win64", "output.asm", "-o", "output.obj");
            nasmProcessBuilder.redirectErrorStream(true);
            Process nasmProcess;
            try {
                nasmProcess = nasmProcessBuilder.start();
                int exitValue = nasmProcess.waitFor();
                if (exitValue != 0) {
                    System.out.println("Obj file has not been saved");
                    return;
                } else {
                    System.out.println("Obj file successfully saved");
                }
            } catch (IOException | InterruptedException ex) {
                ex.printStackTrace();
                System.out.println("Asm file recognition failed");
                return;
            }

            ProcessBuilder linkProcessBuilder = new ProcessBuilder("link", "output.obj", "/OUT:output.exe", "/SUBSYSTEM:CONSOLE", "/ENTRY:_start", "/LARGEADDRESSAWARE:NO");
            linkProcessBuilder.redirectErrorStream(true);
            Process linkProcess;
            try {
                linkProcess = linkProcessBuilder.start();
                int exitValue = linkProcess.waitFor();
                if (exitValue != 0) {
                    System.out.println("Linking failed");
                } else {
                    System.out.println("Linking succeeded. The exe file has been created");
                }
            } catch (IOException | InterruptedException ex) {
                ex.printStackTrace();
                System.out.println("Link file recognition failed");
            }
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(codeTextArea, analyzeButton, lexicalResultTextArea, syntaxResultTextArea, symbolTableTextArea, AsmResultTextArea);


        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}

class MyListener extends java_parsBaseListener {
    private final HashMap<String, SymbolInfo> symbolTable;
    private final HashMap<String, MethodInfo> methodTable;
    private final Set<String> usedVariables;
    private final Set<String> errorMessages = new HashSet<>();
    private final List<AsmInstruction> asmInstructions = new ArrayList<>();


    public MyListener(HashMap<String, SymbolInfo> symbolTable, Set<String> usedVariables) {
        this.symbolTable = symbolTable;
        this.usedVariables = usedVariables;
        this.methodTable = new HashMap<>();
    }

    @Override
    public void enterDeclaration(java_pars.DeclarationContext ctx) {
        String type = ctx.TYPE().getText();
        for (int i = 0; i < ctx.VARIABLE().size(); i++) {
            String variableName = ctx.VARIABLE(i).getText();
            if (!symbolTable.containsKey(variableName)) {
                symbolTable.put(variableName, new SymbolInfo(ctx.getStart().getLine(), type));
                addVariableToDataSection(variableName);
                if (ctx.ASSIGN(i) != null) {
                    String register = getRegisterForVariable(variableName);
                    // Обработка выражения с присвоением результата в регистр
                    processExpression(ctx.expression(i), register);
                    // Сохранение результата из регистра в память, где хранится переменная
                    asmInstructions.add(new AsmInstruction("MOV", "[" + variableName + "]", Arrays.asList(register)));

                }
            } else {
                System.err.println("Error: Variable " + variableName + " is declared multiple times.");
            }
        }
    }

    private final Map<String, String> variableToRegisterMapping = new HashMap<>();
    private final List<String> availableRegisters = Arrays.asList("EAX", "EBX", "ECX", "EDX");
    private int registerCounter = 0;

    private String getRegisterForVariable(String variableName) {
        if (!variableToRegisterMapping.containsKey(variableName)) {
            String register = availableRegisters.get(registerCounter % availableRegisters.size());
            variableToRegisterMapping.put(variableName, register);
            registerCounter++;
            return register;
        }
        return variableToRegisterMapping.get(variableName);
    }

    private final List<String> dataSection = new ArrayList<>();

    private void addVariableToDataSection(String variableName) {

        dataSection.add(variableName + ": " + "dd" + " 0");
    }

    public String getAssemblyCode() {
        StringBuilder assemblyCode = new StringBuilder();
        // Добавление секции данных
        if (!dataSection.isEmpty()) {
            assemblyCode.append("section .data\n");
            for (String data : dataSection) {
                assemblyCode.append("    ").append(data).append("\n");
            }
            assemblyCode.append("\n");
        }

        // Добавление секции текста с инструкциями
        assemblyCode.append("section .text\n");
        assemblyCode.append("global _start\n");
        assemblyCode.append("\n");
        assemblyCode.append("_start:\n");
        for (AsmInstruction instruction : asmInstructions) {
            assemblyCode.append("  ").append(instruction.toString()).append("\n");
        }

        assemblyCode.append("\n");
        assemblyCode.append("    MOV EAX, 1\n");
        assemblyCode.append("    MOV EBX, 0\n");
        assemblyCode.append("    int 0x80");
        return assemblyCode.toString();
    }

    private String processExpression(java_pars.ExpressionContext expression, String destinationRegister) {
        // Переменная для хранения регистра делителя
        String divisorRegister = "EBX";

        for (int i = 0; i < expression.getChildCount(); i += 2) {
            String operand = expression.getChild(i).getText();
            if (i == 0 && expression.getChildCount() > 1) {
                // Загружаем первый операнд в destinationRegister только если он не единственный
                asmInstructions.add(new AsmInstruction("MOV", destinationRegister, Arrays.asList(operand)));
            } else if (i > 0) {
                String operator = expression.getChild(i - 1).getText();
                if (operator.equals("/")) {
                    // Перед делением подготавливаем EAX и EDX, и загружаем делитель в divisorRegister
                    asmInstructions.add(new AsmInstruction("MOV", divisorRegister, Arrays.asList(operand))); // Загружаем делитель
                    asmInstructions.add(new AsmInstruction("MOV", "EAX", Arrays.asList(destinationRegister))); // Перемещаем делимое в EAX
                    asmInstructions.add(new AsmInstruction("XOR", "EDX", Arrays.asList("EDX"))); // Обнуляем EDX
                    asmInstructions.add(new AsmInstruction("IDIV", divisorRegister, new ArrayList<>())); // Выполняем деление
                    asmInstructions.add(new AsmInstruction("MOV", destinationRegister, Arrays.asList("EAX"))); // Сохраняем результат обратно в destinationRegister
                } else {
                    // Для всех операций кроме деления
                    asmInstructions.add(new AsmInstruction(convertOpToAsm(operator), destinationRegister, Arrays.asList(operand)));
                }
            }
        }
        return destinationRegister;
    }


    private String convertOpToAsm(String op) {
        return switch (op) {
            case "+" -> "ADD";
            case "-" -> "SUB";
            case "*" -> "IMUL";
            case "/" -> "IDIV";
            default -> "UNKNOWN_OP";
        };
    }

    @Override
    public void enterAssignment(java_pars.AssignmentContext ctx) {
        //System.out.println("Assignment encountered: " + ctx.getText());
        String variableName = ctx.VARIABLE().getText();
        String register = getRegisterForVariable(variableName);
        String resultVar = processExpression(ctx.expression(), register);

        // Используем имя переменной с результатом для присваивания целевой переменной
        asmInstructions.add(new AsmInstruction("MOV", variableName, Arrays.asList(resultVar)));
        usedVariables.add(variableName);

        if (!symbolTable.containsKey(variableName)) {
            String errorMessage = "Error: Variable " + variableName + " is used before its declaration.";
            if (!errorMessages.contains(errorMessage)) {
                System.err.println(errorMessage);
                errorMessages.add(errorMessage);
            }
            return;
        }

        String variableType = symbolTable.get(variableName).type;
        String expressionType = getExpressionType(ctx.expression());

        if (!isTypeCompatible(variableType, expressionType)) {
            String typeErrorMessage = "Error: Incompatible types in assignment for variable " + variableName + ". Cannot assign " + expressionType + " to " + variableType + ".";
            if (!errorMessages.contains(typeErrorMessage)) {
                System.err.println(typeErrorMessage);
                errorMessages.add(typeErrorMessage);
            }
        }
    }

    private boolean isTypeCompatible(String variableType, String expressionType) {
        if (variableType.equals(expressionType)) return true;

        if ("int".equals(variableType) && "float".equals(expressionType) || "double".equals(expressionType)) {
            // Присваивание float или double к int не разрешено без явного преобразования
            return false;
        }
        if ("float".equals(variableType) && "double".equals(expressionType)) {
            // Присваивание double к float не разрешено без явного преобразования
            return false;
        }
        if ("double".equals(variableType) && ("int".equals(expressionType) || "float".equals(expressionType))) {
            // Присваивание int или float к double разрешено
            return true;
        }
        return false;
    }

    @Override
    public void enterExpression(java_pars.ExpressionContext ctx) {
        String type = "int";

        for (java_pars.TermContext termCtx : ctx.term()) {
            String termType = getTermType(termCtx);
            if ("double".equals(termType)) {
                type = "double"; // Если находим "double", обновляем тип выражения
                break; // Нет необходимости продолжать анализ, "double" имеет высший приоритет
            } else if ("float".equals(termType) && !"double".equals(type)) {
                type = "float"; // Обновляем тип до "float", если ранее не встретили "double"
            } else if (!"error".equals(termType)) {
                type = termType;
            }
        }
        ctx.type = type;
        // System.out.println("Expression type: " + type);
    }

    @Override
    public void enterTerm(java_pars.TermContext ctx) {
        String type = null;
        for (java_pars.FactorContext factorCtx : ctx.factor()) {
            if (type == null) {
                type = getFactorType(factorCtx);
            } else {
                if (!type.equals(getFactorType(factorCtx))) {
                    type = "error";
                    break;
                }
            }
        }
        ctx.type = type;
        //System.out.println("Term type: " + type);
    }

    @Override
    public void enterFactor(java_pars.FactorContext ctx) {
        if (ctx.VARIABLE() != null) {
            String variableName = ctx.VARIABLE().getText();
            usedVariables.add(variableName);

            if (!symbolTable.containsKey(variableName)) {
                String errorMessage = "Error: Variable " + variableName + " is used before its declaration.";
                if (!errorMessages.contains(errorMessage)) {
                    System.err.println(errorMessage);
                    errorMessages.add(errorMessage);
                }
                ctx.type = "error";
            } else {
                ctx.type = symbolTable.get(variableName).type;
            }
        } else if (ctx.integer() != null) {
            ctx.type = "int";
        } else if (ctx.float_() != null) {
            ctx.type = "float";
        } else if (ctx.double_() != null) {
            ctx.type = "double";
        } else if (ctx.expression() != null) {
            ctx.type = getExpressionType(ctx.expression());
        } else {
            ctx.type = "error";
        }
        //System.out.println("Factor type: " + type);
    }

    private String getExpressionType(java_pars.ExpressionContext ctx) {
        String type = "int";
        for (java_pars.TermContext termCtx : ctx.term()) {
            String termType = getTermType(termCtx);
            // Логика обновления типа выражения на основе типов термов
            if ("double".equals(termType)) {
                type = "double"; // Присваиваем высший приоритет типу "double"
                break; // Завершаем обработку, так как "double" имеет наивысший приоритет
            } else if ("float".equals(termType) && !"double".equals(type)) {
                type = "float"; // Присваиваем тип "float", если не встретили "double"
            }
        }
        return type;
    }

    private String getTermType(java_pars.TermContext ctx) {
        String type = "int";
        for (java_pars.FactorContext factorCtx : ctx.factor()) {
            String factorType = getFactorType(factorCtx);
            // Логика обновления типа терма на основе типов факторов
            if ("double".equals(factorType)) {
                return "double"; // Возвращаем "double", если хотя бы один фактор типа "double"
            } else if ("float".equals(factorType) && !"double".equals(type)) {
                type = "float";
            }
        }
        return type;
    }

    private String getFactorType(java_pars.FactorContext ctx) {
        if (ctx.VARIABLE() != null) {
            String variableName = ctx.VARIABLE().getText();
            if (symbolTable.containsKey(variableName)) {
                return symbolTable.get(variableName).type;
            } else {
                String errorMessage = "Error: Variable " + variableName + " is used before its declaration.";
                if (!errorMessages.contains(errorMessage)) {
                    System.err.println(errorMessage);
                    errorMessages.add(errorMessage);
                }
                return "unknown";
            }
        } else if (ctx.integer() != null) {
            return "int";
        } else if (ctx.float_() != null) {
            return "float";
        } else if (ctx.double_() != null) {
            return "double";
        } else if (ctx.expression() != null) {
            return getExpressionType(ctx.expression());
        }
        return "unknown";
    }

    @Override
    public void enterMethod_declaration(java_pars.Method_declarationContext ctx) {
        String methodName = ctx.VARIABLE().getText();
        MethodInfo methodInfo = new MethodInfo();
        if (ctx.parameter_list() != null) {
            for (java_pars.ParameterContext paramCtx : ctx.parameter_list().parameter()) {
                String type = paramCtx.TYPE().getText();
                methodInfo.parameterTypes.add(type);
            }
        }
        methodTable.put(methodName, methodInfo);
    }

    @Override
    public void enterMethod_call(java_pars.Method_callContext ctx) {
        String methodName = ctx.VARIABLE().getText();
        if (!methodTable.containsKey(methodName)) {
            String errorMessage = "Method " + methodName + " not defined.";
            if (!errorMessages.contains(errorMessage)) {
                System.err.println(errorMessage);
                errorMessages.add(errorMessage);
            }
            return;
        }
        MethodInfo methodInfo = methodTable.get(methodName);
        List<String> expectedTypes = methodInfo.parameterTypes;
        List<java_pars.ExpressionContext> args = ctx.expression_list() != null ? ctx.expression_list().expression() : new ArrayList<>();
        if (args.size() != expectedTypes.size()) {
            System.err.println("Method " + methodName + " called with incorrect number of arguments.");
            return;
        }
        for (int i = 0; i < args.size(); i++) {
            String argType = getExpressionType(args.get(i));
            if (!argType.equals(expectedTypes.get(i))) {
                System.err.println("Argument " + (i + 1) + " of method " + methodName + " has incorrect type: expected " + expectedTypes.get(i) + ", got " + argType);
            }
        }
    }

}

class MethodInfo {
    public List<String> parameterTypes;

    public MethodInfo() {
        this.parameterTypes = new ArrayList<>();
    }
}

class AsmInstruction {
    String operation;
    String destination;
    List<String> operands;

    public AsmInstruction(String operation, String destination, List<String> operands) {
        this.operation = operation;
        this.destination = destination;
        this.operands = operands != null ? operands : new ArrayList<>();
    }

    @Override
    public String toString() {
        return operation + " " + destination + ", " + String.join(", ", operands);
    }
}
