package flarscript.tree

interface Node

interface Statement : Node
interface Expression : Node

data class Flarscript(
	val statements: List<Statement>
)

data class NumberLiteral(val value: Double) : Expression
data class StringLiteral(val value: String) : Expression

// expressions
interface BinaryExpression : Expression {
	val left: Expression
	val right: Expression
}

data class PlusExpression(override val left: Expression, override val right: Expression) : BinaryExpression
data class MinusExpression(override val left: Expression, override val right: Expression) : BinaryExpression
data class MultiplyExpression(override val left: Expression, override val right: Expression) : BinaryExpression
data class DivideExpression(override val left: Expression, override val right: Expression) : BinaryExpression
data class ModuloExpression(override val left: Expression, override val right: Expression) : BinaryExpression

data class BracketExpression(val expression: Expression) : Expression

// statements
data class ExpressionStatement(val expression: Expression) : Statement
data class PrintStatement(val expression: Expression) : Statement
