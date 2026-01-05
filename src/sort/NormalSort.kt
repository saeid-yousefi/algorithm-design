package sort

class NormalSort : Sort {
    override fun sort(list: List<Int>): List<Int> {
        val sortedList = mutableListOf<Int>()
        val givenList = list.toMutableList()
        list.forEachIndexed { index, i ->
            val maximumItemIndex = findMaximum(givenList)
            sortedList.add(givenList[maximumItemIndex])
            givenList.removeAt(maximumItemIndex)
        }
        return sortedList
    }

    private fun findMaximum(list: List<Int>): Int {
        var maximumItemIndex = 0
        list.forEachIndexed { index, i ->
            if (list[maximumItemIndex] < i) {
                maximumItemIndex = index
            }
        }
        return maximumItemIndex
    }
}