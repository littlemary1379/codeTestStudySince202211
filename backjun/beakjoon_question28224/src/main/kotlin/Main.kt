fun main(args: Array<String>) {
    question28224()
}

fun question28224() {
    val count = readln().toInt()
    var add = 0
    for (i in 1 .. count) {
        add += readln().toInt()
    }
    println(add)
}