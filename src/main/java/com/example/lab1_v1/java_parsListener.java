// Generated from D:/Stud/IDE/lab1_v1/src/main/java/com/example/lab1_v1/java_pars.g4 by ANTLR 4.13.1
package com.example.lab1_v1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link java_pars}.
 */
public interface java_parsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link java_pars#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(java_pars.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(java_pars.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(java_pars.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(java_pars.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(java_pars.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(java_pars.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(java_pars.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(java_pars.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(java_pars.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(java_pars.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(java_pars.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(java_pars.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(java_pars.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(java_pars.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(java_pars.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(java_pars.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(java_pars.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(java_pars.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(java_pars.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(java_pars.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(java_pars.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(java_pars.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(java_pars.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(java_pars.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(java_pars.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(java_pars.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(java_pars.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(java_pars.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(java_pars.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(java_pars.For_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#for_update}.
	 * @param ctx the parse tree
	 */
	void enterFor_update(java_pars.For_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#for_update}.
	 * @param ctx the parse tree
	 */
	void exitFor_update(java_pars.For_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#increment_in_for}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_in_for(java_pars.Increment_in_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#increment_in_for}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_in_for(java_pars.Increment_in_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#decrement_in_for}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_in_for(java_pars.Decrement_in_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#decrement_in_for}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_in_for(java_pars.Decrement_in_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(java_pars.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(java_pars.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#class_statement}.
	 * @param ctx the parse tree
	 */
	void enterClass_statement(java_pars.Class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#class_statement}.
	 * @param ctx the parse tree
	 */
	void exitClass_statement(java_pars.Class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(java_pars.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(java_pars.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(java_pars.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(java_pars.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(java_pars.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(java_pars.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(java_pars.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(java_pars.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(java_pars.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(java_pars.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(java_pars.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(java_pars.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(java_pars.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(java_pars.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(java_pars.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(java_pars.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link java_pars#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(java_pars.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link java_pars#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(java_pars.Import_nameContext ctx);
}