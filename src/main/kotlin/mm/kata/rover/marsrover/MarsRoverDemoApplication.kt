package mm.kata.rover.marsrover


fun main() {

    val landed = Rover(Position(10, 10), Direction.EAST)
    println("Rover landed: $landed")

    val commandsSequence = "FFLFFRFFL"
    println("Sending command sequence: $commandsSequence")

    val roverAfterExecutingSequence = landed.execute(commandsSequence)

    println("Sequence executed: $roverAfterExecutingSequence")

}
