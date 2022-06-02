package flarscript.tree

import flarscript.grammar.FlarscriptLexer.*
import flarscript.grammar.FlarscriptParser

fun FlarscriptParser.FlarscriptContext.toAst() = Flarscript(statement().map { it.toAst() })

fun FlarscriptParser.StatementContext.toAst() = when (this) {
	is FlarscriptParser.SingleExpressionContext -> ExpressionStatement(expression().toAst())
	is FlarscriptParser.PrintStatementContext -> PrintStatement(expression().toAst())

	else -> TODO("Statement type not supported: ${this::class.java.simpleName}")
}

fun FlarscriptParser.ExpressionContext.toAst(): Expression = when (this) {
	is FlarscriptParser.PlusOrMinusExpressionContext -> when (operator.type) {
		PLUS -> PlusExpression(left.toAst(), right.toAst())
		MINUS -> MinusExpression(left.toAst(), right.toAst())
		else -> TODO() //unreachable
	}

	is FlarscriptParser.MultiplyOrDivideExpressionContext -> when (operator.type) {
		ASTERISK -> MultiplyExpression(left.toAst(), right.toAst())
		SLASH -> DivideExpression(left.toAst(), right.toAst())
		PERCENT -> ModuloExpression(left.toAst(), right.toAst())
		else -> TODO() //unreachable
	}

	is FlarscriptParser.ComparsionExpressionContext -> when (operator.type) {
		EQUAL -> EqualExpression(left.toAst(), right.toAst())
		LESS -> LessExpression(left.toAst(), right.toAst())
		GREATER -> GreaterExpression(left.toAst(), right.toAst())
		LESS_OR_EQUAL -> LessOrEqualExpression(left.toAst(), right.toAst())
		GREATER_OR_EQUAL -> GreaterOrEqualExpression(left.toAst(), right.toAst())
		else -> TODO() // unreachable
	}

	is FlarscriptParser.BracketExpressionContext -> BracketExpression(expression().toAst())
	is FlarscriptParser.NumberLiteralContext -> NumberLiteral(value.text.toDouble())
	is FlarscriptParser.StringLiteralContext -> StringLiteral(value.text.drop(1).dropLast(1))

	else -> ErrorExpression(this)
}
