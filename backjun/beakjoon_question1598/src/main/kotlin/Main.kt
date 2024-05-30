import kotlin.math.abs

fun main(args: Array<String>) {
    question1598()
}

fun question1598() {
    readln().split(" ").map { it.toInt() }.let {
        val first = if(it[0] % 4 == 0) {
            listOf((it[0] / 4) - 1, 4)
        } else {
            listOf(it[0] / 4, it[0] % 4)
        }
        val second = if(it[1] % 4 == 0) {
            listOf((it[1] / 4) - 1, 4)
        } else {
            listOf(it[1] / 4, it[1] % 4)
        }

        println(abs(first[0] - second[0]) + abs(first[1] - second[1]))
    }
}