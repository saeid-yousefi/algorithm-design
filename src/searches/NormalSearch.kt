package searches

class NormalSearch : Search {
    override fun find(list: List<Int>, item: Int): Int? {
        list.forEachIndexed { index, thisItem ->
            if (thisItem == item) {
                return index
            }
        }
        return null
    }
}