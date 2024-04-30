fun main(args: Array<String>) {
    question20492()
}

fun question20492() {
    val price = readln().toDouble()
    println((price / 100 * 78).toInt())
    println((price / 10000 * (20 * 78 + 8000)).toInt())
}