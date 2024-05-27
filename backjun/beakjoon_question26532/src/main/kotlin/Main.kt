import kotlin.math.ceil

fun main(args: Array<String>) {
    question26532()
}

fun question26532() {
    readln().split(" ").map { it.toDouble() }.let {
        println(ceil((it[0] * it[1] / 4840) / 5 ).toInt())
    }
}