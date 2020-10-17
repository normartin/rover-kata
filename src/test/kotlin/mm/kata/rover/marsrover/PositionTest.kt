package mm.kata.rover.marsrover

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionTest {
    @Test
    fun `moves to new location`() {

        assertThat(Position(0, 0).forward(Direction.NORTH)).isEqualTo(Position(0, 1))
        assertThat(Position(0, 0).forward(Direction.EAST)).isEqualTo(Position(1, 0))
        assertThat(Position(0, 0).forward(Direction.SOUTH)).isEqualTo(Position(0, -1))
        assertThat(Position(0, 0).forward(Direction.WEST)).isEqualTo(Position(-1, 0))

    }
}