package flarscript.cli

import flarscript.FlarscriptFacade
import java.io.InputStream
import kotlin.system.exitProcess

typealias CommandHandler = (String) -> String?

/**
 * Interactively reads flarscript lines from the providen stream and executes them,
 * outputting to STDOUT and STDERR, depending on situation.
 *
 * Intended to be used by a real user within a terminal;
 * allows to execute simple commands.
 *
 * @param stream input stream to read from
 * @param humanReadable whether to make output human-readable
 */
open class InteractiveInterpreter(
	private val stream: InputStream,
	val humanReadable: Boolean = true
) {
	open val commandPrefix get() = ":"
	protected val commands = HashMap<String, CommandHandler>()

	init {
		commands["help"] = { """
			Built-in commands:
			- ${commandPrefix}help — show help message
			— ${commandPrefix}exit — exit from the interpreter
		""".trimIndent() }

		commands["exit"] = { exitProcess(0) }
	}

	/** Launches the interpreter and blocks the thread until the quit command is called or the stream is closed. */
	open fun launch() {
		if (humanReadable) {
			println("""
				Welcome to Interactive Flarscript Interpreter v$interpreterVersion!
				
				Type a script in order to execute it.
				Type ${commandPrefix}help to see a list of a available commands,
				or ${commandPrefix}exit to exit from the interpreter.
			""".trimIndent())
		}

		printInputMarker()

		stream.bufferedReader().use {
			var line = ""

			while (it.readLine()?.trim()?.also { ln -> line = ln } != null) {
				if (line.startsWith(commandPrefix)) {
					handleCommand(line)
				} else {
					handleInput(line)
				}

				printInputMarker()
			}
		}
	}

	protected open fun handleInput(line: String) {
		if (line.isEmpty()) return

		val result = FlarscriptFacade.parse(line)

		if (result.errors.isEmpty()) {
			result.execute()
		} else {
			println("Parse error")
			System.err.println(result.errors.joinToString("\n") {
				"    - ${it.message}"
			})
		}
	}

	protected open fun handleCommand(line: String) {
		val name = line.takeWhile { !it.isWhitespace() }.substring(1)
		val args = line.substring(name.length + 1).trim()
		val command = commands.getOrDefault(name, null)

		if (command == null) {
			System.err.println("Unknown command: $name")
		} else {
			print("- ")
			println(command(args))
		}
	}

	protected open fun printInputMarker() {
		if (!humanReadable) return

		println()
		print("Fs $ ")
	}

	companion object {
		const val interpreterVersion = "0.1"
	}
}
