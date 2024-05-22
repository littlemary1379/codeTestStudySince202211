import kotlin.math.min

fun main(args: Array<String>) {
    question23825()
}

fun question23825() {
    val sa = readln().split(" ").map { it.toInt() }
    println(min(sa[0] / 2, sa[1] / 2))
}