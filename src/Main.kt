import searches.NormalSearch

fun main() {
    runWithTimer("found with normal search in") {
        NormalSearch().find(dummySortedList, dummyItem)
    }
}