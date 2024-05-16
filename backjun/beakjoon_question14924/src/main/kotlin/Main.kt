fun main(args: Array<String>) {
    question14924()
}

fun question14924() {
    val miles = readln().split(" ").map { it.toInt() }
    println(miles[2] / (miles[0] * 2) * miles[1])
}