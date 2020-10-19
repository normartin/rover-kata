package mm.kata.rover.marsrover

import mm.kata.rover.marsrover.internal.Command
import mm.kata.rover.marsrover.internal.parse
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommandTest {

    @Test
    fun `parse ignores unknown commands`() {
        assertThat("XL".parse()).containsExactly(Command.L)
    }

    @Test
    fun `parses all known commands`() {
        assertThat("LFR".parse()).containsExactly(Command.L, Command.F, Command.R)
    }

}