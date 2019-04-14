package pajus.cz.quickwordcompetition.gamecore

class LetterGrid(height: Int,
                 width: Int,
                 private val alphabet: Alphabet,
                 private val generator: Prng):
        Grid(height, width) {

    init {
        generate()
    }

    private fun generate(){
        for (row in 0 until height){
            for (column in 0 until width){
               // grid[row][column] = this.alphabet[generator.next(alphabet.size())]
            }
        }
    }
}