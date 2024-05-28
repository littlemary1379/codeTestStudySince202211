fun main(args: Array<String>) {
    question28352()
}

fun question28352() {
    val count = readln().toInt()
    var pactorial = 1L
    for (i in 1 .. count) {
        pactorial *= i
    }
    println(pactorial / (7 * 24 * 60 * 60))
}