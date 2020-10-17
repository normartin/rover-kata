package mm.kata.rover.marsrover

enum class TurnDirection {
    LEFT, RIGHT
}

data class Rover(val position: Position, val heading: Direction)

fun Rover.execute(command: Command): Rover = when (command) {
    Command.L -> this.copy(heading = heading.steer(TurnDirection.LEFT))
    Command.R -> this.copy(heading = heading.steer(TurnDirection.RIGHT))
    Command.F -> this.copy(position = position.forward(heading))
}




