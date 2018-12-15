package pajus.cz.quickwordcompetition.gamecore

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.contains
import org.hamcrest.Matchers.hasSize
import org.hamcrest.Matchers.`is` as Is
import org.junit.jupiter.api.Test


internal class GridTest {

    @Test
    fun showEmptyGrid() {
        val smallGrid = Grid(3,2)

        assertThat(smallGrid.width, Is(3))
        assertThat(smallGrid.height, Is(2))
        assertThat(smallGrid.grid.size, Is(2))
    }

    @Test
    fun showBigGrid() {
        val bigGrid = Grid(1,25)

        assertThat(bigGrid.width, Is(1))
        assertThat(bigGrid.height, Is(25))
        assertThat(bigGrid.grid.size, Is(25))
    }

    @Test
    fun grigToString() {

    }



}

