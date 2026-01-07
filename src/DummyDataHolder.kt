import kotlin.random.Random

object DummyDataHolder {
    val dummyUnSortedList by lazy {
        val list = mutableListOf<Int>()
        val maximumRange = 10_000
        repeat(maximumRange) {
            list.add(Random.nextInt(maximumRange))
        }
        list
    }
    val dummySortedList by lazy {
        val list = mutableListOf<Int>()
        repeat(10_000_000) {
            list.add(it)
        }
        list
    }

    val dummyHashMap by lazy {
        val hashmap: HashMap<Int, Int> = hashMapOf()
        repeat(10_000_000) {
            hashmap[it] = it
        }
        hashmap
    }
}

const val dummyItem = 9_000_000

