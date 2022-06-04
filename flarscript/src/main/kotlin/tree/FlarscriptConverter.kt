package flarscript.tree

import flarscript.grammar.FlarscriptLexer.*
import flarscript.grammar.FlarscriptParser
import flarscript.util.ConversionError
import org.antlr.v4.runtime.ParserRuleContext

class FlarscriptConverter {
	val errors = ArrayList<ConversionError>()

	/**
	 * Converts the result of [FlarscriptParser] to an executable flarogus syntax tree.
	 *
	 * Any errors occurred during the conversion are saved to [errors].
	 */
	fun convert(context: FlarscriptParser.FlarscriptContext): Flarscript {
		errors.clear()

		return context.toAst()
	}

	private fun FlarscriptParser.FlarscriptContext.toAst() = Flarscript(statement().map {
		try {
			it.toAst()
		} catch (e: Exception) {
			it.errorStatement("An internal converter exception has occurred: $e")
		}
	})

	private fun FlarscriptParser.StatementBlockContext.toAst(): List<Statement> = statement().map { it.toAst() }

	private fun FlarscriptParser.StatementContext.toAst() = when (this) {
		is FlarscriptParser.SingleExpressionContext -> ExpressionStatement(expression().toAst())
		is FlarscriptParser.PrintStatementContext -> PrintStatement(expression().toAst())

		is FlarscriptParser.IfStatementContext -> IfStatement(
			condition = ifPart()?.condition?.toAst() ?: errorExpression("if statement must have a condition!"),
			mainBlock = ifPart()?.statementBlock()?.toAst() ?: listOf(errorStatement("if statement must have a body!")),
			elseBlock = elsePart()?.statementBlock()?.toAst()
		)

		else -> errorStatement("Statement not implemented: ${this::class.simpleName}")
	}

	private fun FlarscriptParser.ExpressionContext.toAst(): Expression = when (this) {
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
			else -> TODO(operator.text + operator.type) // unreachable
		}

		is FlarscriptParser.BracketExpressionContext -> BracketExpression(expression().toAst())
		is FlarscriptParser.NumberLiteralContext -> NumberLiteral(value.text.toDouble())
		is FlarscriptParser.StringLiteralContext -> StringLiteral(value.text.drop(1).dropLast(1))
		is FlarscriptParser.BooleanLiteralContext -> BooleanLiteral(value.type == TRUE)
		is FlarscriptParser.NullLiteralContext -> NullLiteral()

		else -> errorExpression("Expression not implemented: ${this::class.simpleName}")
	}

	private fun ParserRuleContext.error(description: String) {
		errors.add(ConversionError(
			description,
			this.start.line, this.stop.line,
			this.start.charPositionInLine, this.stop.charPositionInLine,
			this
		))
	}

	private fun ParserRuleContext.errorStatement(description: String) = error(description).let {
		ErrorStatement(this)
	}

	private fun ParserRuleContext.errorExpression(description: String) = error(description).let {
		ErrorExpression(this)
	}
}
