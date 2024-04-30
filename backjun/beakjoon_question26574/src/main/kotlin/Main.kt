fun main(args: Array<String>) {
    question26574()
}

fun question26574() {
    val count = readln().toInt()

    for(i in 1 .. count) {
        val number = readln()
        println("$number $number")
    }
}