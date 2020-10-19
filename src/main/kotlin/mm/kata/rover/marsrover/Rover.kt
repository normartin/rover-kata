package mm.kata.rover.marsrover

import mm.kata.rover.marsrover.internal.execute
import mm.kata.rover.marsrover.internal.parse

enum class Direction { NORTH, EAST, SOUTH, WEST }

data class Position(val x: Int, val y: Int)

data class Rover(val position: Position, val heading: Direction)

fun Rover.execute(commandString: String): Rover = commandString.parse().fold(this, Rover::execute)
