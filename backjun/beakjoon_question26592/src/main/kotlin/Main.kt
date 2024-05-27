import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {
    question26592()
}

fun question26592() {
    val count = readln().toInt()
    for (i in 1 .. count) {
        readln().split(" ").map { it.toDouble() }.let {
            println("The height of the triangle is ${BigDecimal(it[0] / it[1] * 2).setScale(2, RoundingMode.HALF_EVEN)} units")
        }
    }
}