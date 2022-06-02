package flarscript

import flarscript.executor.FlarscriptExecutor
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
	/**
	 * Tries to execute this result with [FlarscriptExecutor]
	 * @throws IllegalStateException If there are errors
	 * @throws NullPointerException If the script is null.
	*/
	fun execute() {
		if (errors.isNotEmpty()) {
			throw IllegalStateException(buildString {
				append("This flarscript contains errors:\n")
				errors.forEach {
					append("\n    - ").append(it.message)
				}
			})
		} else if (script == null) {
			throw NullPointerException("FlarscriptParseResult.script cannot be null.")
		}

		FlarscriptExecutor(script).execute()
	}
}
