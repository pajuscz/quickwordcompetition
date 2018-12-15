package pajus.cz.quickwordcompetition.gamecore

class Alphabet(private val letters: String,
        private val frequencies: List<Double>){

    operator fun get(index: Int): Char{
        return letters[index]
    }

    fun size(): Int{
        return letters.length
    }
}