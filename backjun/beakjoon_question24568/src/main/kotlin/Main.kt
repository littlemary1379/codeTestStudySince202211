fun main(args: Array<String>) {
    question24568()
}

fun question24568() {
    val regular = readln().toInt()
    val small = readln().toInt()

    println((regular * 8 + small * 3) - 28)
}