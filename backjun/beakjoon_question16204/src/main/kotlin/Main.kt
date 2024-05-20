import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    question16204()
}

fun question16204() {
    val card = readln().split(" ").map { it.toInt() }
    println(min(card[1], card[2]) + card[0] - max(card[1], card[2]))
}