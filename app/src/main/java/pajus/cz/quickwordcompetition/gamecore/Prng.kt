package pajus.cz.quickwordcompetition.gamecore

import java.util.*

class Prng(seed: Long) {
    private val generator = Random(seed)

    fun next(alphabetSize: Int): Int{
        return generator.nextInt(alphabetSize)
    }
}