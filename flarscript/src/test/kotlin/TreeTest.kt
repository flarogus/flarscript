package flarscript

import flarscript.tree.*
import org.junit.jupiter.api.Test
import kotlin.test.*
import kotlin.test.DefaultAsserter.assertTrue

class TreeTest {
	@Test
	fun `a simple tree is constructed correctly`() {
		val input = "out << (3 + 8) + 2"
		val parsed = FlarscriptFacade.parse(input)

		assertTrue("There must be no errors:", parsed.errors.isEmpty())
		assertNotNull(parsed.script, "Script must not be null")

		assertEquals(
			Flarscript(listOf(
				PrintStatement(PlusExpression(
					BracketExpression(
						PlusExpression(NumberLiteral(3.0), NumberLiteral(8.0))
					),
					NumberLiteral(2.0)
				))
			)
		), parsed.script, "Expected and actual ASTs are not equal.")
	}

	@Test
	fun `a complex script is parsed`() {
		val script = """
			out << "hello " + (3 + 2 + (2 * 7)) + " amogi"; // this line is utter nonsense
			
			/** Multiline comment *
			 * on ho!             */
			out << 'yet another statement'
			out << /** Comment between statements */ "hellogus"
		""".trimIndent()

		val parsed = FlarscriptFacade.parse(script)

		assertNotNull(parsed.script, "The script must be parsed!")
	}
}
