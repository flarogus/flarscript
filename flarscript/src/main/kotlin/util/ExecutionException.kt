package flarscript.util

import flarscript.tree.Node

class ExecutionException(
	val node: Node,
	description: String
) : Exception(description) {
	override val message: String
		get() = """An execution exception has occurred while executing node "$node": ${super.message}"""
}
