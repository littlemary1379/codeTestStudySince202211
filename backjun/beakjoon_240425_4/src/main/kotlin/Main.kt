fun main(args: Array<String>) {
    question2914()
}

fun question2914() {
    val songs = readln().split(" ").map { it.toInt() }

    println((songs[0] * (songs[1] - 1)) + 1)
}