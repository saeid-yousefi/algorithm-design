package sort

class QuickSort : Sort {
    override fun sort(list: List<Int>): List<Int> {
        return quickSort(list)
    }

    private fun quickSort(list: List<Int>): List<Int> {
        if (list.size <= 1) return list

        val pivotIndex = list.size / 2
        val pivotValue = list[pivotIndex]

        val smaller = mutableListOf<Int>()
        val greater = mutableListOf<Int>()

        list.forEachIndexed { index, value ->
            if (index == pivotIndex) return@forEachIndexed
            if (value < pivotValue) smaller.add(value)
            else greater.add(value)
        }

        return quickSort(smaller) + pivotValue + quickSort(greater)
    }
}