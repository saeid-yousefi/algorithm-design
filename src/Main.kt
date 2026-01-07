import DummyDataHolder.dummyHashMap
import DummyDataHolder.dummySortedList
import DummyDataHolder.dummyUnSortedList
import searches.BinarySearch
import searches.HashMapSearch
import searches.NormalSearch
import sort.MergeSort
import sort.NormalSort
import sort.QuickSort

fun main() {
    println("Warm-up: accessing lists...")
    dummySortedList.size
    dummyUnSortedList.size
    dummyHashMap.size
    println("Lists are ready!")
    println("-----------------")

    runWithTimer("found with normal search in") {
        println("item index = " + NormalSearch().find(dummySortedList, dummyItem))
    }
    runWithTimer("found with binary search in") {
        println("item index = " + BinarySearch().find(dummySortedList, dummyItem))
    }
    runWithTimer("found with hashmap search in") {
        println("item index = " + HashMapSearch().find(dummyHashMap, dummyItem))
    }
    runWithTimer("Array normally sorted in") {
        println(NormalSort().sort(dummyUnSortedList))
    }
    runWithTimer("Array quick sorted in") {
        println(QuickSort().sort(dummyUnSortedList))
    }
    runWithTimer("Array merge sorted in") {
        println(MergeSort().sort(dummyUnSortedList))
    }
}