package pajus.cz.quickwordcompetition.gamecore

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class LetterGridTest{

    @Test
    fun constructWithCzechAlphabet(){

        val letterGrid1 = LetterGrid(12, 23, Alphabets.Czech, Prng(2321))
        val letterGrid2 = LetterGrid(3, 3, Alphabets.Czech, Prng(2321))

        assertThat(letterGrid1.grid[0][0], `is`(equalTo(letterGrid2.grid[0][0])))
        assertThat(letterGrid1.grid[0][2], `is`(equalTo(letterGrid2.grid[0][2])))
        // in grid2 row is smaller first line in the grid1 will start the same as whole grid2
        assertThat(letterGrid1.grid[0][3], `is`(equalTo(letterGrid2.grid[1][0])))
    }
}