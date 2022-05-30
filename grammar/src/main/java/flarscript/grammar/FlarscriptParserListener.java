// Generated from /data/data/com.termux/files/home/projects/flarscript/grammar/FlarscriptParser.g4 by ANTLR 4.10.1
package flarscript.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlarscriptParser}.
 */
public interface FlarscriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlarscriptParser#flarscript}.
	 * @param ctx the parse tree
	 */
	void enterFlarscript(FlarscriptParser.FlarscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlarscriptParser#flarscript}.
	 * @param ctx the parse tree
	 */
	void exitFlarscript(FlarscriptParser.FlarscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleExpression}
	 * labeled alternative in {@link FlarscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(FlarscriptParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleExpression}
	 * labeled alternative in {@link FlarscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(FlarscriptParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link FlarscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(FlarscriptParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link FlarscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(FlarscriptParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(FlarscriptParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(FlarscriptParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(FlarscriptParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(FlarscriptParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOperationExpression(FlarscriptParser.OperationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOperationExpression(FlarscriptParser.OperationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(FlarscriptParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(FlarscriptParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDivideOp(FlarscriptParser.DivideOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDivideOp(FlarscriptParser.DivideOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyOp(FlarscriptParser.MultiplyOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyOp(FlarscriptParser.MultiplyOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuloOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterModuloOp(FlarscriptParser.ModuloOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuloOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitModuloOp(FlarscriptParser.ModuloOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPlusOp(FlarscriptParser.PlusOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPlusOp(FlarscriptParser.PlusOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMinusOp(FlarscriptParser.MinusOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMinusOp(FlarscriptParser.MinusOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlarscriptParser#ends}.
	 * @param ctx the parse tree
	 */
	void enterEnds(FlarscriptParser.EndsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlarscriptParser#ends}.
	 * @param ctx the parse tree
	 */
	void exitEnds(FlarscriptParser.EndsContext ctx);
}