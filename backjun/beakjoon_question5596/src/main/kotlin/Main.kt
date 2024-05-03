import kotlin.math.max

fun main(args: Array<String>) {
    question5596()
}

fun question5596() {
    val minguk = readln().split(" ").sumOf { it.toInt() }
    val mansea = readln().split(" ").sumOf { it.toInt() }
    println(max(minguk, mansea))
}