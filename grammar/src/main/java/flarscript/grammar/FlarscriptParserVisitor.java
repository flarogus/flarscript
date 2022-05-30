// Generated from /data/data/com.termux/files/home/projects/flarscript/grammar/FlarscriptParser.g4 by ANTLR 4.10.1
package flarscript.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlarscriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlarscriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlarscriptParser#flarscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlarscript(FlarscriptParser.FlarscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleExpression}
	 * labeled alternative in {@link FlarscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(FlarscriptParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link FlarscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(FlarscriptParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(FlarscriptParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(FlarscriptParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationExpression(FlarscriptParser.OperationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link FlarscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(FlarscriptParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideOp(FlarscriptParser.DivideOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyOp(FlarscriptParser.MultiplyOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuloOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloOp(FlarscriptParser.ModuloOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOp(FlarscriptParser.PlusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusOp}
	 * labeled alternative in {@link FlarscriptParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOp(FlarscriptParser.MinusOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlarscriptParser#ends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnds(FlarscriptParser.EndsContext ctx);
}