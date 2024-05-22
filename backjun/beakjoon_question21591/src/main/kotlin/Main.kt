fun main(args: Array<String>) {
    question21591()
}

fun question21591() {
    val widths = readln().split(" ").map { it.toInt() }
    if(widths[0] - widths[2] >= 2 && widths[1] - widths[3] >= 2) {
        println("1")
    } else {
        println("0")
    }
}