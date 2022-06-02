package flarscript.tree

import flarscript.grammar.FlarscriptParser

interface Node

sealed interface Statement : Node
sealed interface Expression : Node

data class Flarscript(
	val statements: List<Statement>
)

data class NumberLiteral(val value: Double) : Expression
data class StringLiteral(val value: String) : Expression

// expressions
data class BracketExpression(val expression: Expression) : Expression

sealed interface BinaryExpression : Expression {
	val left: Expression
	val right: Expression
}

// operation expressions
data class PlusExpression(override val left: Expression, override val right: Expression) : BinaryExpression
data class MinusExpression(override val left: Expression, override val right: Expression) : BinaryExpression
data class MultiplyExpression(override val left: Expression, override val right: Expression) : BinaryExpression
data class DivideExpression(override val left: Expression, override val right: Expression) : BinaryExpression
data class ModuloExpression(override val left: Expression, override val right: Expression) : BinaryExpression

// comparison expressions
sealed interface ComparisonExpression : BinaryExpression

data class LessExpression(override val left: Expression, override val right: Expression) : ComparisonExpression
data class LessOrEqualExpression(override val left: Expression, override val right: Expression) : ComparisonExpression
data class EqualExpression(override val left: Expression, override val right: Expression) : ComparisonExpression
data class GreaterOrEqualExpression(override val left: Expression, override val right: Expression) : ComparisonExpression
data class GreaterExpression(override val left: Expression, override val right: Expression) : ComparisonExpression

// statements
data class ExpressionStatement(val expression: Expression) : Statement
data class PrintStatement(val expression: Expression) : Statement

// errors
data class ErrorStatement(val errorContext: FlarscriptParser.StatementContext) : Statement {
	val text get() = errorContext.text
	override fun toString() = """<ERROR STATEMENT: "$text">"""
}

data class ErrorExpression(val errorContext: FlarscriptParser.ExpressionContext) : Expression {
	val text get() = errorContext.text
	override fun toString() = """<ERROR EXPRESSION: "$text">"""
}
