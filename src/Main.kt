import searches.BinarySearch
import searches.NormalSearch

fun main() {
    runWithTimer("found with normal search in") {
        println("item index=" + NormalSearch().find(dummySortedList, dummyItem))
    }
    runWithTimer("found with binary search in") {
        println("item index=" + BinarySearch().find(dummySortedList, dummyItem))
    }
}