package sort

class MergeSort : Sort {
    private val threshold = 1

    override fun sort(list: List<Int>): List<Int> {
        return mergeSort(list)
    }

    private fun mergeSort(list: List<Int>): List<Int> {
        if (list.size <= threshold) {
            return list
        }
        val middle = list.size / 2
        val left = list.subList(0, middle)
        val right = list.subList(middle, list.size)
        val sortedLeft = mergeSort(left)
        val sortedRight = mergeSort(right)
        return merge(sortedLeft, sortedRight)
    }

    private fun merge(left: List<Int>, right: List<Int>): List<Int> {

        val result = mutableListOf<Int>()
        var i = 0
        var j = 0

        while (i < left.size && j < right.size) {
            if (left[i] <= right[j]) {
                result.add(left[i])
                i++
            } else {
                result.add(right[j])
                j++
            }
        }

        while (i < left.size) {
            result.add(left[i])
            i++
        }

        while (j < right.size) {
            result.add(right[j])
            j++
        }

        return result
    }
}