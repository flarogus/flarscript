package flarscript.tree

import flarscript.grammar.FlarscriptLexer
import flarscript.grammar.FlarscriptParser.*

fun FlarscriptContext.toAst() = Flarscript(statement().map { it.toAst() })

fun StatementContext.toAst() = when (this) {
	is SingleExpressionContext -> ExpressionStatement(expression().toAst())
	is PrintStatementContext -> PrintStatement(expression().toAst())

	else -> TODO("Statement type not supported: ${this::class.java.simpleName}")
}

fun ExpressionContext.toAst(): Expression = when (this) {
	is PlusOrMinusExpressionContext -> when (operator.text) {
		"+" -> PlusExpression(left.toAst(), right.toAst())
		"-" -> MinusExpression(left.toAst(), right.toAst())
		else -> TODO() //unreachable
	}
	is MultiplyOrDivideExpressionContext -> when (operator.text) {
		"*" -> MultiplyExpression(left.toAst(), right.toAst())
		"/" -> DivideExpression(left.toAst(), right.toAst())
		"%" -> ModuloExpression(left.toAst(), right.toAst())
		else -> TODO() //unreachable
	}
	is BracketExpressionContext -> BracketExpression(expression().toAst())
	is NumberLiteralContext -> NumberLiteral(value.text.toDouble())
	is StringLiteralContext -> StringLiteral(value.text)

	else -> TODO("Expression type not supported: ${this::class.simpleName}")
}
