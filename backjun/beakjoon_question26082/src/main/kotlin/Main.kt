fun main(args: Array<String>) {
    question26082()
}

fun question26082() {
    val list = readln().split(" ").map { it.toInt() }
    println((list[1] / list[0]) * 3 * list[2])
}