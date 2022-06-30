package flarscript

import flarscript.grammar.*
import flarscript.tree.FlarscriptConverter
import flarscript.util.*
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import java.io.*
import java.nio.charset.Charset
import java.util.*

object FlarscriptFacade {
	/** @see parse(InputStream) */
	fun parse(file: File) = parse(FileInputStream(file))

	/**  @see parse(InputStream) */
	fun parse(string: String) = parse(ByteArrayInputStream(string.toByteArray()))

	/**
	 * Parses an input stream as a flarscript source file.
	 * Returns a [FlarscriptParseResult], which contains a list of errors and the resulting script
	 * (if the former is not empty, the latter is null).
	 *
	 * Normally, this method does not throw any exceptions,
	 * any issues in the script are reported to [FlarscriptResult.errors].
	 *
	 * The resulting script can be executed by calling [FlarscriptParseResult.execute()].
	 */
	@Suppress("DEPRECATION")
	fun parse(stream: InputStream): FlarscriptParseResult {
		val errors = ArrayList<ScriptError>()

		val listener = object : ANTLRErrorListener {
			override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
				errors.add(ParseError(msg ?: "unknown error", line, line, charPositionInLine, charPositionInLine))
			}
			override fun reportAmbiguity(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, exact: Boolean, ambigAlts: BitSet?, configs: ATNConfigSet?) {
				// todo
			}
			override fun reportAttemptingFullContext(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, conflictingAlts: BitSet?, configs: ATNConfigSet?) {
				// todo
			}
			override fun reportContextSensitivity(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, prediction: Int, configs: ATNConfigSet?) {
				// todo
			}
		}

		val lexer = FlarscriptLexer(ANTLRInputStream(stream)).also {
			it.removeErrorListeners()
			it.addErrorListener(listener)
		}
		val parser = FlarscriptParser(CommonTokenStream(lexer)).also {
			it.removeErrorListeners()
			it.addErrorListener(listener)
		}

		val result = if (errors.isEmpty()) {
			val converter = FlarscriptConverter(parser.flarscript())
			converter.convert().also {
				errors.addAll(converter.errors)
			}
		} else {
			null
		}


		return FlarscriptParseResult(
			if (errors.isEmpty()) result else null,
			errors
		)
	}
}

