package flarscript.util

class ParseException(
	val causes: List<ScriptError>
) : Exception() {
	override val message: String?
		get() = buildString {
			append("This flarscript contains errors:\n")

			causes.forEach {
				append("\n    - ").append(it.message)
			}
		}
}
