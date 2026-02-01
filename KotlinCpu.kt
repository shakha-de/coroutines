import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val N = 10_000
    val time = measureTimeMillis {
        val jobs = List(N) {
            launch(Dispatchers.Default) {
                var sum = 0L
                for (i in 0 until 1_000_000) {
                    sum += i
                }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Kotlin (Coroutines): Finished $N tasks (CPU-bound) in $time ms")
}
