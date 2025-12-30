import kotlin.system.measureTimeMillis

fun runWithTimer(tag: String, action: () -> Unit) {
    val timer = measureTimeMillis {
        action()
    }
    println("$tag : $timer ms")
}