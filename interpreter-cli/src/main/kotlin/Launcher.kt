package flarscript.cli

import flarscript.FlarscriptFacade
import java.io.File
import kotlin.system.exitProcess

fun main(vararg args: String) {
	if ("--help" in args || "-h" in args || args.size > 1) {
		println("""
			Usage: flarscript         — run in interactive mode, reading line-by-line
			       flarscript -       — read from STDIN, write output to STDOUT and errors to STDERR
			       flarscript file.kt — read from a specific file
			       flarscript --help  — show this message
		""".trimIndent())
		return;
	}

	val file = args.getOrNull(0)
	if (file == null) {
		InteractiveInterpreter(System.`in`).launch()
	} else {
		val script = if (file == "-") {
			System.`in`
		} else {
			File(file).inputStream()
		}

		val output = FlarscriptFacade.parse(script)
		if (output.errors.isEmpty()) {
			output.execute()
		} else {
			println("Sparse error")
			System.err.println(output.errors.map {
				"    - " + it.message
			}.joinToString("\n"))

			exitProcess(1)
		}
	}
}
