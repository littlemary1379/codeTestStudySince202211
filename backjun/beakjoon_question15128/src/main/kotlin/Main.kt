import java.math.BigDecimal

fun main(args: Array<String>) {
    question15128()
}

fun question15128() {
    val input = readln().split(" ").map { it.toLong() }
    val p1 = input[0]
    val q1 = input[1]
    val p2 = input[2]
    val q2 = input[3]

    val numerator = p1 * p2
    val denominator = 2 * q1 * q2

    if (numerator % denominator == 0L) {
        println(1)
    } else {
        println(0)
    }
}