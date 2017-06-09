// Generated from RankPL.g4 by ANTLR 4.7
package com.tr.rp.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RankPLParser}.
 */
public interface RankPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RankPLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(RankPLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RankPLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(RankPLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RankPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RankPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RankPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RankPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RankPLParser#functiondef_or_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef_or_statement(RankPLParser.Functiondef_or_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RankPLParser#functiondef_or_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef_or_statement(RankPLParser.Functiondef_or_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RankPLParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(RankPLParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RankPLParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(RankPLParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(RankPLParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(RankPLParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChoiceAssignmentStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterChoiceAssignmentStatement(RankPLParser.ChoiceAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChoiceAssignmentStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitChoiceAssignmentStatement(RankPLParser.ChoiceAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RangeChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRangeChoiceStatement(RankPLParser.RangeChoiceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RangeChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRangeChoiceStatement(RankPLParser.RangeChoiceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadFileStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadFileStatement(RankPLParser.ReadFileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadFileStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadFileStatement(RankPLParser.ReadFileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDecStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStatement(RankPLParser.IncDecStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDecStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStatement(RankPLParser.IncDecStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(RankPLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(RankPLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(RankPLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(RankPLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(RankPLParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(RankPLParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObserveStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterObserveStatement(RankPLParser.ObserveStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObserveStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitObserveStatement(RankPLParser.ObserveStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObserveLStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterObserveLStatement(RankPLParser.ObserveLStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObserveLStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitObserveLStatement(RankPLParser.ObserveLStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObserveJStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterObserveJStatement(RankPLParser.ObserveJStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObserveJStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitObserveJStatement(RankPLParser.ObserveJStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkipStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSkipStatement(RankPLParser.SkipStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSkipStatement(RankPLParser.SkipStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RankedChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRankedChoiceStatement(RankPLParser.RankedChoiceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RankedChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRankedChoiceStatement(RankPLParser.RankedChoiceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndifferentChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIndifferentChoiceStatement(RankPLParser.IndifferentChoiceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndifferentChoiceStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIndifferentChoiceStatement(RankPLParser.IndifferentChoiceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementSequence}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatementSequence(RankPLParser.StatementSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementSequence}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatementSequence(RankPLParser.StatementSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(RankPLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(RankPLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(RankPLParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(RankPLParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CutStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCutStatement(RankPLParser.CutStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CutStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCutStatement(RankPLParser.CutStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(RankPLParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertStatement}
	 * labeled alternative in {@link RankPLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(RankPLParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RankPLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(RankPLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RankPLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(RankPLParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link RankPLParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(RankPLParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link RankPLParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(RankPLParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpression}
	 * labeled alternative in {@link RankPLParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(RankPLParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpression}
	 * labeled alternative in {@link RankPLParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(RankPLParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link RankPLParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(RankPLParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link RankPLParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(RankPLParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arithmetic1Expression}
	 * labeled alternative in {@link RankPLParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic1Expression(RankPLParser.Arithmetic1ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arithmetic1Expression}
	 * labeled alternative in {@link RankPLParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic1Expression(RankPLParser.Arithmetic1ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arithmetic2Expression}
	 * labeled alternative in {@link RankPLParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic2Expression(RankPLParser.Arithmetic2ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arithmetic2Expression}
	 * labeled alternative in {@link RankPLParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic2Expression(RankPLParser.Arithmetic2ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexedExpression}
	 * labeled alternative in {@link RankPLParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterIndexedExpression(RankPLParser.IndexedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexedExpression}
	 * labeled alternative in {@link RankPLParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitIndexedExpression(RankPLParser.IndexedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link RankPLParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterFieldExpression(RankPLParser.FieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link RankPLParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitFieldExpression(RankPLParser.FieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralIntExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterLiteralIntExpression(RankPLParser.LiteralIntExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralIntExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitLiteralIntExpression(RankPLParser.LiteralIntExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralBoolExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBoolExpr(RankPLParser.LiteralBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralBoolExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBoolExpr(RankPLParser.LiteralBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralStringExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterLiteralStringExpr(RankPLParser.LiteralStringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralStringExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitLiteralStringExpr(RankPLParser.LiteralStringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(RankPLParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(RankPLParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InferringFunctionCall}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterInferringFunctionCall(RankPLParser.InferringFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InferringFunctionCall}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitInferringFunctionCall(RankPLParser.InferringFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(RankPLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(RankPLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpr(RankPLParser.NegateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpr(RankPLParser.NegateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(RankPLParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(RankPLParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsSetExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterIsSetExpr(RankPLParser.IsSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsSetExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitIsSetExpr(RankPLParser.IsSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterAbsExpr(RankPLParser.AbsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitAbsExpr(RankPLParser.AbsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterMinExpr(RankPLParser.MinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitMinExpr(RankPLParser.MinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterMaxExpr(RankPLParser.MaxExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitMaxExpr(RankPLParser.MaxExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParseIntExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterParseIntExpr(RankPLParser.ParseIntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParseIntExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitParseIntExpr(RankPLParser.ParseIntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LenExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterLenExpr(RankPLParser.LenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LenExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitLenExpr(RankPLParser.LenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubStringExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterSubStringExpr(RankPLParser.SubStringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubStringExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitSubStringExpr(RankPLParser.SubStringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RankExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterRankExpr(RankPLParser.RankExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RankExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitRankExpr(RankPLParser.RankExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitExpr(RankPLParser.ArrayInitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitExpr(RankPLParser.ArrayInitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayConstructExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructExpr(RankPLParser.ArrayConstructExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayConstructExpr}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructExpr(RankPLParser.ArrayConstructExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictionaryExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryExpression(RankPLParser.DictionaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictionaryExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryExpression(RankPLParser.DictionaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(RankPLParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExpression}
	 * labeled alternative in {@link RankPLParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(RankPLParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RankPLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RankPLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RankPLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RankPLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RankPLParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(RankPLParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RankPLParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(RankPLParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RankPLParser#assignment_target}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_target(RankPLParser.Assignment_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link RankPLParser#assignment_target}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_target(RankPLParser.Assignment_targetContext ctx);
}