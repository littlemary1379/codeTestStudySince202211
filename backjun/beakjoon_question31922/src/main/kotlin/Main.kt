import kotlin.math.max

fun main(args: Array<String>) {
    question31922()
}

fun question31922() {
    readln().split(" ").map { it.toInt() }.let {
        println(max(it[0] + it[2], it[1]))
    }
}