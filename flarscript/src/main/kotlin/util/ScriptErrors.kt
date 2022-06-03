package flarscript.util

import org.antlr.v4.runtime.ParserRuleContext

abstract class ScriptError(
	val description: String,
	val lineStart: Int, val lineEnd: Int,
	val charStart: Int, val charEnd: Int
) {
	abstract val name: String

	val message get() = if (lineStart != lineEnd) {
		"$name: $description at $lineStart:$charStart ~ $lineEnd:$charEnd"
	} else if (charStart != charEnd) {
		"$name: $description at line $lineStart, $charStart~$charEnd"
	} else {
		"$name: $description at $lineStart:$charStart"
	}
}

class ParseError(
	description: String,
	lineStart: Int, lineEnd: Int,
	charStart: Int, charEnd: Int
) : ScriptError(description, lineStart, lineEnd, charStart, charEnd) {
	override val name get() = "Parse error"
}

class ConversionError(
	description: String,
	lineStart: Int, lineEnd: Int,
	charStart: Int, charEnd: Int,
	val node: ParserRuleContext
) : ScriptError(description, lineStart, lineEnd, charStart, charEnd) {
	override val name get() = "Conversion error"
}
