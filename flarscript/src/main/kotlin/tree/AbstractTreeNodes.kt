package flarscript.tree

import org.antlr.v4.runtime.ParserRuleContext

interface Node

sealed interface Statement : Node
sealed interface Expression : Node

data class Flarscript(
	val statements: List<Statement>
)

// literals
sealed class Literal<T>(val value: T) : Expression {
	override fun equals(other: Any?) = if (other is Literal<*>) value == other.value else super.equals(other)

	override fun toString() = "<literal: $value>"
}

class NumberLiteral(value: Double) : Literal<Double>(value)
class StringLiteral(value: String) : Literal<String>(value)
class BooleanLiteral(value: Boolean) : Literal<Boolean>(value)
class NullLiteral : Literal<Nothing?>(null)

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
data class IfStatement(val condition: Expression, val mainBlock: List<Statement>, val elseBlock: List<Statement>?) : Statement

// errors
data class ErrorStatement(val errorContext: ParserRuleContext?) : Statement {
	val text get() = errorContext?.text
	override fun toString() = """<ERROR STATEMENT: "$text">"""
}

data class ErrorExpression(val errorContext: ParserRuleContext?) : Expression {
	val text get() = errorContext?.text
	override fun toString() = """<ERROR EXPRESSION: "$text">"""
}
