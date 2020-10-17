package mm.kata.rover.marsrover

enum class Command {
    L, R, F
}

fun String.parse(): List<Command> = map {
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
