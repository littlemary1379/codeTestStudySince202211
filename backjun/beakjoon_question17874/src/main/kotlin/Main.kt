fun main(args: Array<String>) {
    question17874()
}

fun question17874() {
    val cake = readln().split(" ").map { it.toInt() }
    val piece = listOf(cake[1] * cake[2], (cake[0] - cake[1]) * cake[2], (cake[0] - cake[2]) * cake[1], (cake[0] - cake[1]) * (cake[0] - cake[2]))

    println(piece.max() * 4)
}