fun main(args: Array<String>) {
    question1085()
}

fun question1085() {
    val location = readln().split(" ").map { it.toInt() }

    var length = listOf<Int>(location[0], location[1], (location[2]-location[0]), (location[3]-location[1]))

    println(length.min())
}