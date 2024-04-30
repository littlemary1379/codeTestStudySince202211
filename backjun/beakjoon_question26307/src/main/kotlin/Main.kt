fun main(args: Array<String>) {
    question26307()
}

fun question26307() {
    val time = readln().split(" ").map { it.toInt() }
    println((time[0] - 9) * 60 + time[1])
}