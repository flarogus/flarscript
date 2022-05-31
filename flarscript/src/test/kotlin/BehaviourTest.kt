package flarscript

import flarscript.executor.FlarscriptExecutor
import org.junit.jupiter.api.Test
import java.io.*
import kotlin.test.assertEquals

class BehaviourTest {
	@Test
	fun `a simple script prints the correct result`() {
		val script = "out << 2 + 3 * 2"

		val output = catchOutput {
			FlarscriptFacade.parse(script).execute()
		}

		assertEquals("8.0", output, "Incorrect script output")
	}
}

/** Redirects [System.out] to an output stream that writes to a string builder while executing [block] */
private inline fun catchOutput(block: () -> Unit): String {
	val stream = ByteArrayOutputStream()
	val out = PrintStream(stream)
	val oldOut = System.out
	System.setOut(out)

	try {
		block()
	} finally {
		System.setOut(oldOut)
	}

	return String(stream.toByteArray()).trim()
}
