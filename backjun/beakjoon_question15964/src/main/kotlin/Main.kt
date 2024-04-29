fun main(args: Array<String>) {
    question15963()
}

fun question15963() {
    val numbers = readln().split(" ").map{ it.toLong() }
    println((numbers[0] + numbers[1]) * (numbers[0] - numbers[1]))
}