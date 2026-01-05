import DummyDataHolder.dummySortedList
import DummyDataHolder.dummyUnSortedList
import searches.BinarySearch
import searches.NormalSearch
import sort.NormalSort

fun main() {
    println("Warm-up: accessing lists...")
    dummySortedList.size
    dummyUnSortedList.size

    runWithTimer("found with normal search in") {
        println("item index = " + NormalSearch().find(dummySortedList, dummyItem))
    }
    runWithTimer("found with binary search in") {
        println("item index = " + BinarySearch().find(dummySortedList, dummyItem))
    }
    runWithTimer("Array normally sorted in") {
        println(NormalSort().sort(dummyUnSortedList))
    }
}