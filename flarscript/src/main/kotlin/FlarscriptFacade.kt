package flarscript

import flarscript.grammar.*
import flarscript.tree.FlarscriptConverter
import flarscript.util.ParseError
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import java.io.*
import java.nio.charset.Charset
import java.util.*

object FlarscriptFacade {
	fun parse(file: File) = parse(FileInputStream(file))

	fun parse(string: String) = parse(string.toStream())

	@Suppress("DEPRECATION")
	fun parse(stream: InputStream): FlarscriptParseResult {
		val errors = ArrayList<ParseError>()

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

		return FlarscriptParseResult(
			if (errors.isEmpty()) FlarscriptConverter().convert(parser.flarscript()) else null,
			errors
		)
	}
}

fun String.toStream(charset: Charset = Charsets.UTF_8) = ByteArrayInputStream(toByteArray(charset))
