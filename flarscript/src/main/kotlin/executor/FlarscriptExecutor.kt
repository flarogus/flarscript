package flarscript.executor

import flarscript.FlarscriptParseResult
import flarscript.tree.*
import javax.naming.OperationNotSupportedException
import kotlin.contracts.*

@Suppress("MemberVisibilityCanBePrivate", "NAME_SHADOWING")
open class FlarscriptExecutor(
	val script: Flarscript
) {
	constructor(result: FlarscriptParseResult) : this(
		result.script ?: throw IllegalArgumentException("Cannot execute a parse result that has no resulting AST.")
	)

	/** Executes this script. */
	fun execute() {
		script.statements.forEach {
			it.execute()
		}
	}

	protected fun Statement.execute() {
		when (this) {
			is PrintStatement -> println(expression.execute())

			is ExpressionStatement -> expression.execute()
		}
	}

	protected fun Expression.execute(): Any? = when (this) {
		is NumberLiteral -> value
		is StringLiteral -> value
		is BinaryExpression -> execute()
		is BracketExpression -> expression.execute()
	}

	protected fun BinaryExpression.execute(): Any? {
		val left = left.execute()
		val right = right.execute()

		return when (this) {
			is PlusExpression -> when {
				left is Double && right is Double -> left + right

				left is StringBuilder -> left.append(right)
				right is StringBuilder -> right.append(left)
				left is String || right is String -> StringBuilder().append(left).append(right)

				else -> throwNotSupported(left, right, "add")
			}

			is MinusExpression -> onlyNumbers(left, right, "substract") { left, right ->
				left - right
			}

			is MultiplyExpression -> onlyNumbers(left, right, "multiply") { left, right ->
				left * right
			}

			is DivideExpression -> onlyNumbers(left, right, "divide") { left, right ->
				left / right
			}

			is ModuloExpression -> onlyNumbers(left, right, "modulo") { left, right ->
				left % right
			}
		}
	}

	private fun throwNotSupported(left: Any?, right: Any?, operation: String): Nothing {
		throw OperationNotSupportedException("Operation \"$operation\" is not supported with operand types ${left.simpleName()} and ${right.simpleName()}")
	}

	/** Executes the block if both operands are doubles or throws [OperationNotSupportedException] otherwise. */
	@OptIn(ExperimentalContracts::class)
	private inline fun <T> onlyNumbers(left: Any?, right: Any?, operation: String, block: (left: Double, right: Double) -> T): T {
		contract {
			returns() implies (left is Double && right is Double)
		}

		if (left !is Double || right !is Double) throwNotSupported(left, right, operation)
		return block(left, right)
	}

	private fun Any?.simpleName(): String = this?.let { it::class.simpleName } ?: "null"
}