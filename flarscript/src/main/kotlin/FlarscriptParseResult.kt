package flarscript

import flarscript.tree.Flarscript

/**
 * Represents the result of parsing a flarscript source code.
 *
 * @param script The root of abstract source tree built from the source code. May be null if there are errors.
 * @param errors Errors occurred during parsing.
 */
class FlarscriptParseResult(
	val script: Flarscript?,
	val errors: List<ParseError>
) {

}
