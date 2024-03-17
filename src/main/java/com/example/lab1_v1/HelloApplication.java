package com.example.lab1_v1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;


public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lexical Analyzer");

        TextArea codeTextArea = new TextArea();
        codeTextArea.setWrapText(true);

        TextArea resultTextArea = new TextArea();
        resultTextArea.setEditable(false);

        Button analyzeButton = new Button("Analyze");
        analyzeButton.setOnAction(e -> {
            String code = codeTextArea.getText();
            java_lex lexer = new java_lex(new ANTLRInputStream(code));

            StringBuilder result = new StringBuilder();

            Token token;
            while ((token = lexer.nextToken()).getType() != Token.EOF) {
                result.append("Token: ").append(lexer.getVocabulary().getSymbolicName(token.getType()))
                        .append(", Text: ").append(token.getText())
                        .append(", Line: ").append(token.getLine())
                        .append(", Position: ").append(token.getCharPositionInLine())
                        .append("\n");
            }

            resultTextArea.setText(result.toString());
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(codeTextArea, analyzeButton, resultTextArea);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}