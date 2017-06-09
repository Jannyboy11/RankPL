// Generated from RankPL.g4 by ANTLR 4.7
package com.tr.rp.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RankPLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RankPLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RankPLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(RankPLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RankPLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RankPLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RankPLParser#functiondef_or_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef_or_statement(RankPLParser.Functiondef_or_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RankPLParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(RankPLParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(RankPLParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChoiceAssignmentStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceAssignmentStatement(RankPLParser.ChoiceAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RangeChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeChoiceStatement(RankPLParser.RangeChoiceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadFileStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFileStatement(RankPLParser.ReadFileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncDecStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStatement(RankPLParser.IncDecStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(RankPLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(RankPLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(RankPLParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObserveStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObserveStatement(RankPLParser.ObserveStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObserveLStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObserveLStatement(RankPLParser.ObserveLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObserveJStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObserveJStatement(RankPLParser.ObserveJStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipStatement(RankPLParser.SkipStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RankedChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRankedChoiceStatement(RankPLParser.RankedChoiceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndifferentChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndifferentChoiceStatement(RankPLParser.IndifferentChoiceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementSequence}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSequence(RankPLParser.StatementSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(RankPLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(RankPLParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CutStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCutStatement(RankPLParser.CutStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(RankPLParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RankPLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(RankPLParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link RankPLParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(RankPLParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExpression}
	 * labeled alternative in {@link RankPLParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(RankPLParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link RankPLParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(RankPLParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arithmetic1Expression}
	 * labeled alternative in {@link RankPLParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic1Expression(RankPLParser.Arithmetic1ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arithmetic2Expression}
	 * labeled alternative in {@link RankPLParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic2Expression(RankPLParser.Arithmetic2ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexedExpression}
	 * labeled alternative in {@link RankPLParser#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedExpression(RankPLParser.IndexedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link RankPLParser#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpression(RankPLParser.FieldExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralIntExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralIntExpression(RankPLParser.LiteralIntExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralBoolExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBoolExpr(RankPLParser.LiteralBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralStringExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralStringExpr(RankPLParser.LiteralStringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(RankPLParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InferringFunctionCall}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferringFunctionCall(RankPLParser.InferringFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(RankPLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpr(RankPLParser.NegateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(RankPLParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsSetExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsSetExpr(RankPLParser.IsSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbsExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsExpr(RankPLParser.AbsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinExpr(RankPLParser.MinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxExpr(RankPLParser.MaxExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParseIntExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseIntExpr(RankPLParser.ParseIntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LenExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenExpr(RankPLParser.LenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubStringExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubStringExpr(RankPLParser.SubStringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RankExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRankExpr(RankPLParser.RankExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitExpr(RankPLParser.ArrayInitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayConstructExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructExpr(RankPLParser.ArrayConstructExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictionaryExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryExpression(RankPLParser.DictionaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(RankPLParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RankPLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(RankPLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RankPLParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(RankPLParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link RankPLParser#assignment_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_target(RankPLParser.Assignment_targetContext ctx);
}