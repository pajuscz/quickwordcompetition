package pajus.cz.quickwordcompetition.gamecore

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class PrngTest {

    @Test
    fun sameNumberWithSameSeed(){
        val prgn1 = Prng(23)
        val prgn2 = Prng(23)

        assertThat(prgn1.next(333), `is`(equalTo(prgn2.next(333))))
    }
}