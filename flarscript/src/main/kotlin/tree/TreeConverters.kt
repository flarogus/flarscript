package flarscript.tree

import flarscript.grammar.FlarscriptParser.*

fun FlarscriptContext.toAst() = Flarscript(statement().map { it.toAst() })

fun StatementContext.toAst() = when (this) {
	is SingleExpressionContext -> ExpressionStatement(expression().toAst())
	is PrintStatementContext -> PrintStatement(expression().toAst())

	else -> TODO("Statement type not supported: ${this::class.java.simpleName}")
}

fun ExpressionContext.toAst(): Expression = when (this) {
	is OperationExpressionContext -> when (operation()) {
		is PlusOpContext -> PlusExpression(left.toAst(), right.toAst())
		is MinusOpContext -> MinusExpression(left.toAst(), right.toAst())
		is MultiplyOpContext -> MultiplyExpression(left.toAst(), right.toAst())
		is DivideOpContext -> DivideExpression(left.toAst(), right.toAst())
		is ModuloOpContext -> ModuloExpression(left.toAst(), right.toAst())

		else -> TODO("Operation type not supported: ${this::class.simpleName}")
	}
	is BracketExpressionContext -> BracketExpression(expression().toAst())
	is NumberLiteralContext -> NumberLiteral(value.text.toDouble())
	is StringLiteralContext -> StringLiteral(value.text)

	else -> TODO("Expression type not supported: ${this::class.simpleName}")
}
