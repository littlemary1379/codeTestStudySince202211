fun main(args: Array<String>) {
    question8370()
}

fun question8370() {
    val seats = readln().split(" ").map { it.toInt()}
    println("${seats[0] * seats[1] + seats[2] * seats[3]}")
}