package mm.kata.rover.marsrover.internal

import mm.kata.rover.marsrover.Rover

internal enum class Command { L, R, F }

internal fun String.parse(): List<Command> = map {
    when (it) {
        'L' -> Command.L
        'R' -> Command.R
        'F' -> Command.F
        else -> {
            // TODO: business decision what should happen here
            // use proper logging
            println("WARN Unknown command: $it. Ignoring it")
            null
        }
    }
}.filterNotNull()

internal fun Rover.execute(command: Command): Rover = when (command) {
    Command.L -> this.copy(heading = heading.steer(TurnDirection.LEFT))
    Command.R -> this.copy(heading = heading.steer(TurnDirection.RIGHT))
    Command.F -> this.copy(position = position.forward(heading))
}
