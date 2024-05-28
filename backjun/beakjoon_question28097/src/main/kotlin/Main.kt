fun main(args: Array<String>) {
    question28097()
}

fun question28097() {
    val count = readln().toInt()
    val time = readln().split(" ").sumOf { it.toInt() } + 8 * (count - 1)
    println("${time / 24} ${time % 24}")
}