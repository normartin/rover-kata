package mm.kata.rover.marsrover

data class Position(val x: Int, val y: Int) {

    fun forward(direction: Direction): Position {
        return when (direction) {
            Direction.NORTH -> copy(y = y + 1)
            Direction.EAST -> copy(x = x + 1)
            Direction.SOUTH -> copy(y = y - 1)
            Direction.WEST -> copy(x = x - 1)
        }
    }
}
