package mm.kata.rover.marsrover

import mm.kata.rover.marsrover.Direction.*
import mm.kata.rover.marsrover.internal.TurnDirection.LEFT
import mm.kata.rover.marsrover.internal.TurnDirection.RIGHT
import mm.kata.rover.marsrover.internal.steer
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectionTest {

    @Test
    fun `turns to correct direction`() {

        assertThat(NORTH.steer(LEFT)).isEqualTo(WEST)
        assertThat(NORTH.steer(RIGHT)).isEqualTo(EAST)

        assertThat(EAST.steer(LEFT)).isEqualTo(NORTH)
        assertThat(EAST.steer(RIGHT)).isEqualTo(SOUTH)

        assertThat(SOUTH.steer(LEFT)).isEqualTo(EAST)
        assertThat(SOUTH.steer(RIGHT)).isEqualTo(WEST)

        assertThat(WEST.steer(LEFT)).isEqualTo(SOUTH)
        assertThat(WEST.steer(RIGHT)).isEqualTo(NORTH)
    }

}