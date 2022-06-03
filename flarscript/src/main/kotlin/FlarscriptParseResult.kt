package flarscript

import flarscript.executor.FlarscriptExecutor
import flarscript.tree.Flarscript
import flarscript.util.*

/**
 * Represents the result of parsing a flarscript source code.
 *
 * @param script The root of abstract source tree built from the source code. May be null if there are errors.
 * @param errors Errors occurred during parsing.
 */
class FlarscriptParseResult(
	val script: Flarscript?,
	val errors: List<ScriptError>
) {
	/**
	 * Tries to execute this result with [FlarscriptExecutor]
	 * @throws ParseException If there are parse-time errors in the script.
	 * @throws NullPointerException If the script is null. Can not occur if this result was produced by [FlarscriptFacade]
	 * @throws ExecutionException If there is a runtime error in the script.
	*/
	fun execute() {
		if (errors.isNotEmpty()) {
			throw ParseException(errors)
		} else if (script == null) {
			throw NullPointerException("FlarscriptParseResult.script cannot be null.")
		}

		FlarscriptExecutor(script).execute()
	}

	/**
	 * Executes the script.
	 * If an exception occurs, catches it and calls [exceptionFallback]
	 *
	 * @see execute
	 */
	inline fun executeGuarded(
		exceptionFallback: (Exception) -> Unit = { throw it }
	) {
		try {
			execute()
		} catch (e: Exception) {
			exceptionFallback(e)
		}
	}
}
