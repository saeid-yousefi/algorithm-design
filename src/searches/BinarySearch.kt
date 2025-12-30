package searches

class BinarySearch : Search {
    override fun find(list: List<Int>, item: Int): Int? {
        var low = 0
        var high = list.size - 1
        while (low != high) {
            val mid = (low + high) / 2
            when {
                list[mid] == item -> {
                    return mid
                }
                list[mid] > item -> {
                    high = mid - 1
                }

                list[mid] < item -> {
                    low = mid + 1
                }
            }
        }
        return null
    }
}