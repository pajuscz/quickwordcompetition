package pajus.cz.quickwordcompetition.gamecore

class Grid(val width: Int,
           val height: Int){

    var grid: Array<CharArray> = Array(height) { CharArray(width) }


    private fun string(): String {
        return grid.contentDeepToString()
                .replace("], ", "\n")
                .filter {
                    it != '[' && it != ']'
                }
    }

    override fun toString(): String {
        return "Grid [w:$width x h:$height]\n" +
               "${string()}"
    }
}