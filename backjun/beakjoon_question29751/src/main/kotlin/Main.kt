fun main(args: Array<String>) {
    question29751()
}

fun question29751() {
    println(readln().split(" ").map { it.toInt() }.let {
        (it[1] * it[0]).toDouble() / 2
    })
}