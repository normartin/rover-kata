package mm.kata.rover.marsrover

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoverTest {


    @Test
    fun `can drive a circle`() {

        val centeredNorth = Rover(Position(0, 0), Direction.NORTH)

        val destination = centeredNorth.execute("FLFLFLFL")

        assertThat(destination.position).isEqualTo(Position(0, 0))

    }

}