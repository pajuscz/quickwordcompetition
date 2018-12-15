package pajus.cz.quickwordcompetition.gamecore

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is` as Is
import org.junit.jupiter.api.Test


internal class AlphabetTest {

    @Test
    fun get() {
        val alphabet = Alphabet("abcdš", listOf())

        assertThat(alphabet[0], Is('a'))
        assertThat(alphabet[4], Is('š'))
    }

    @Test
    fun size() {
        val alphabet = Alphabet("abcd", listOf())

        assertThat(alphabet.size(), Is(4))
    }

    @Test
    fun czechAlphabet() {
        val alphabet = Alphabets.Czech

        assertThat(alphabet.size(), Is(34))
        assertThat(alphabet[3], Is('č'))
        assertThat(alphabet[7], Is('ě'))
    }
}