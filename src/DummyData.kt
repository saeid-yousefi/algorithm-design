val dummySortedList = createDummyList()
const val dummyItem = 9_000_000

private fun createDummyList(): List<Int> {
    val list = mutableListOf<Int>()
    repeat(10_000_000) {
        list.add(it)
    }
    return list
}