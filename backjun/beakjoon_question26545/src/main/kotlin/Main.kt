fun main(args: Array<String>) {
    question26545()
}

fun question26545() {
    val count = readln().toInt()

    var add = 0
    for (i in 1 .. count) {
        add += readln().toInt()
    }

    println(add)
}