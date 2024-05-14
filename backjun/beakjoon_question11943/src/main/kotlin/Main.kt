import kotlin.math.min

fun main(args: Array<String>) {
    question11943()
}

fun question11943() {
    val basket1 = readln().split(" ").map { it.toInt() }
    val basket2 = readln().split(" ").map { it.toInt() }

    println(min((basket1[0] + basket2[1]), (basket1[1] + basket2[0])))
}