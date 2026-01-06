import DummyDataHolder.dummySortedList
import DummyDataHolder.dummyUnSortedList
import searches.BinarySearch
import searches.NormalSearch
import sort.NormalSort
import sort.QuickSort

fun main() {
    println("Warm-up: accessing lists...")
    dummySortedList.size
    dummyUnSortedList.size
    println("Lists are ready!")
    println("-----------------")
    runWithTimer("found with normal search in") {
        println("item index = " + NormalSearch().find(dummySortedList, dummyItem))
    }
    runWithTimer("found with binary search in") {
        println("item index = " + BinarySearch().find(dummySortedList, dummyItem))
    }
    runWithTimer("Array normally sorted in") {
        println(NormalSort().sort(dummyUnSortedList))
    }
    runWithTimer("Array quick sorted in") {
        println(QuickSort().sort(dummyUnSortedList))
    }
}