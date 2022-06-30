package flarscript.executor

import flarscript.FlarscriptParseResult
import flarscript.tree.*
import flarscript.util.ExecutionException
import javax.naming.OperationNotSupportedException
import kotlin.contracts.*

@Suppress("MemberVisibilityCanBePrivate", "NAME_SHADOWING", "OPT_IN_IS_NOT_ENABLED")
open class FlarscriptExecutor(
	val script: Flarscript
) {
	constructor(result: FlarscriptParseResult) : this(
		result.script
			?: throw IllegalArgumentException("Cannot execute a parse result that has no resulting AST.")
	)

	/** Executes this script. */
	fun execute() = script.statements.execute()

	protected fun List<Statement>.execute() = forEach {
		it.execute()
	}

	protected fun Statement.execute() {
		when (this) {
			is PrintStatement -> println(expression.execute())
			is ExpressionStatement -> expression.execute()

			is IfStatement -> {
				val value = condition.execute()

				(value as? Boolean)?.let {
					if (it) mainBlock.execute() else elseBlock?.execute()
				} ?: throw ExecutionException(this, "if condition must return a Boolean, but a ${value?.simpleName()} was returned")
			}

			is ErrorStatement -> throw ExecutionException(this, "unreported parse error: statement '${text}' could not be parsed")
		}
	}

	protected fun Expression.execute(): Any? = when (this) {
		is Literal<*> -> value
		is BinaryExpression -> execute()
		is BracketExpression -> expression.execute()

		is ErrorExpression -> throw ExecutionException(this, "Unreported parse error: expression '${text}' could not be parsed")
	}

	protected fun BinaryExpression.execute(): Any? {
		val left = left.execute()
		val right = right.execute()

		return when (this) {
			is PlusExpression -> when {
				left is Double && right is Double -> left + right
				left is String -> left + right.toStringSafe()
				right is String -> left.toStringSafe() + right
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

			is ComparisonExpression -> execute()
		}
	}

	protected fun ComparisonExpression.execute(): Boolean {
		val left = left.execute()
		val right = right.execute()

		return if (this is EqualExpression) {
			left == right
		} else {
			onlyNumbers(left, right, "comparison") { _, _ -> }

			when (this) {
				is LessExpression -> left < right
				is GreaterExpression -> left > right
				is LessOrEqualExpression -> left <= right
				is GreaterOrEqualExpression -> left >= right

				else -> throw ExecutionException(this, "operation not implemented: ${simpleName()}") // normally unreachable
			}
		}
	}

	private fun Node.throwNotSupported(left: Any?, right: Any?, operation: String): Nothing {
		throw ExecutionException(this, "operation \"$operation\" is not supported with operand types ${left.simpleName()} and ${right.simpleName()}")
	}

	/** Executes the block if both operands are doubles or throws [ExecutionException] otherwise. */
	@OptIn(ExperimentalContracts::class)
	private inline fun <T> Node.onlyNumbers(
		left: Any?,
		right: Any?,
		operation: String,
		block: (left: Double, right: Double) -> T
	): T {
		contract {
			returns() implies (left is Double && right is Double)
		}

		if (left !is Double || right !is Double) throwNotSupported(left, right, operation)
		return block(left, right)
	}

	private fun Any?.simpleName(): String = this?.let { it::class.simpleName } ?: "null"

	private fun Any?.toStringSafe(): String = when (this) {
		null -> "null"
		is Double -> if (this % 1.0 == 0.0) toDouble().toString() else toString()
		else -> toString()
	}
}

