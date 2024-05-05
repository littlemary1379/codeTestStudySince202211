import java.lang.Math.max
import kotlin.math.abs

fun main(args: Array<String>) {
    question6749()
}

fun question6749() {
    val child1 = readln().toInt()
    val child2 = readln().toInt()

    println(child1.coerceAtLeast(child2) + abs(child1 - child2))
}