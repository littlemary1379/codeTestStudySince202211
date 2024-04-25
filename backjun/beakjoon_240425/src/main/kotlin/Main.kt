fun main(args: Array<String>) {
    question2163()
}

fun question2163() {
    val chocolate = readln().split(" ").map { it.toInt() }

    val width = (chocolate[1] - 1) + (chocolate[1] * (chocolate[0] - 1))
    println(width)

}
