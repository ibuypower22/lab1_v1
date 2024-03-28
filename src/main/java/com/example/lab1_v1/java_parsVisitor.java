// Generated from D:/Stud/IDE/lab1_v1/src/main/java/com/example/lab1_v1/java_pars.g4 by ANTLR 4.13.1
package com.example.lab1_v1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link java_pars}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface java_parsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link java_pars#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(java_pars.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(java_pars.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(java_pars.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(java_pars.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(java_pars.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(java_pars.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(java_pars.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(java_pars.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(java_pars.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(java_pars.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(java_pars.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(java_pars.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(java_pars.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(java_pars.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(java_pars.For_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update(java_pars.For_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#increment_in_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_in_for(java_pars.Increment_in_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#decrement_in_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement_in_for(java_pars.Decrement_in_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(java_pars.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_statement(java_pars.Class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(java_pars.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(java_pars.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(java_pars.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(java_pars.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(java_pars.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(java_pars.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(java_pars.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(java_pars.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java_pars#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(java_pars.Import_nameContext ctx);
}