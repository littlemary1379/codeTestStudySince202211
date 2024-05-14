fun main(args: Array<String>) {
    question11945()
}

fun question11945() {
    val count = readln().split(" ").map { it.toInt() }
    for (i in 1 .. count[0]) {
        println(readln().reversed())
    }
}