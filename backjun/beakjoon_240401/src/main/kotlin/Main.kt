import kotlin.math.floor
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question13909()
}

fun question13909() {
    val person = readln().toInt()
    val sqrt = sqrt(person.toDouble())
    val open = floor(sqrt)
    println(open.toInt())
}