fun main(args: Array<String>) {
    question13241()
}

fun question13241() {
    val originNumbers = readln().split(" ").map { it.toLong() }
    val numbers = originNumbers.sortedDescending().toMutableList()
    val result : Long
    while (true) {
        val remain = numbers[0] % numbers[1]
        if(remain == 0L) {
            result = numbers[1]
            break
        } else {
            numbers[0] = numbers[1]
            numbers[1] = remain
        }
    }

    val calA = originNumbers[0] / result
    val calB = originNumbers[1] / result

    println(result * calA * calB)
}