package mm.kata.rover.marsrover.internal

import mm.kata.rover.marsrover.Direction
import mm.kata.rover.marsrover.Position

internal enum class TurnDirection { LEFT, RIGHT }

internal fun Direction.steer(turn: TurnDirection) = when (turn) {
    TurnDirection.LEFT -> when (this) {
        Direction.NORTH -> Direction.WEST
        Direction.EAST -> Direction.NORTH
        Direction.SOUTH -> Direction.EAST
        Direction.WEST -> Direction.SOUTH
    }
    TurnDirection.RIGHT -> when (this) {
        Direction.NORTH -> Direction.EAST
        Direction.EAST -> Direction.SOUTH
        Direction.SOUTH -> Direction.WEST
        Direction.WEST -> Direction.NORTH
    }
}

internal fun Position.forward(direction: Direction): Position {
    return when (direction) {
        Direction.NORTH -> copy(y = y + 1)
        Direction.EAST -> copy(x = x + 1)
        Direction.SOUTH -> copy(y = y - 1)
        Direction.WEST -> copy(x = x - 1)
    }
}
