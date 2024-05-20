fun main(args: Array<String>) {
    question17362()
}

fun question17362() {
    val number = readln().toLong()

    println(when ((number % 8).toInt()) {
        1 -> "1"
        0, 2 -> "2"
        3, 7 -> "3"
        4, 6 -> "4"
        5 -> "5"
        else -> {""}
    })
}