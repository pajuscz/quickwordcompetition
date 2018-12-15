package pajus.cz.quickwordcompetition.gamecore

open class Grid(val height: Int,
                val width: Int){

    var grid: Array<CharArray> = Array(height) { CharArray(width) }

//    init {
//        for (y in 0 until height){
//            for (x in 0 until width){
//                grid[y][x] = 'x'
//            }
//        }
//    }

    private fun string(): String {
        return grid.contentDeepToString()
                .replace("], ", "\n")
                .filter {
                    it != '[' && it != ']'
                }
    }

    override fun toString(): String {
        return "Grid [w:$width x h:$height]\n" +
                string()
    }

}