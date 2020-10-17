package mm.kata.rover.marsrover

enum class Direction {
    NORTH, EAST, SOUTH, WEST;

    fun steer(turn: TurnDirection): Direction = when (turn) {
        TurnDirection.LEFT -> when (this) {
            NORTH -> WEST
            EAST -> NORTH
            SOUTH -> EAST
            WEST -> SOUTH
        }
        TurnDirection.RIGHT -> when (this) {
            NORTH -> EAST
            EAST -> SOUTH
            SOUTH -> WEST
            WEST -> NORTH
        }
    }
}