import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val N = 10_000
    val time = measureTimeMillis {
        val jobs = List(N) {
            launch {
                delay(10)
            }
        }
        jobs.forEach { it.join() }
    }
    println("Kotlin (Coroutines): Finished $N tasks in $time ms")
}
