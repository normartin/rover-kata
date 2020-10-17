package mm.kata.rover.marsrover

import mm.kata.rover.marsrover.Command.F
import mm.kata.rover.marsrover.Command.L
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoverTest {


    @Test
    fun `can drive a circle`() {

        val centeredNorth = Rover(Position(0, 0), Direction.NORTH)

        val destination = listOf(F, L, F, L, F, L, F, L).fold(centeredNorth, { r, c -> r.execute(c) })

        assertThat(destination.position).isEqualTo(Position(0, 0))

    }

}