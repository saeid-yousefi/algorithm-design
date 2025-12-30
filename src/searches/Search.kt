package searches

interface Search {
    fun find(list: List<Int>, item: Int): Int?
}