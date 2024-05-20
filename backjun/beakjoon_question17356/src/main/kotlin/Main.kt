import java.math.BigDecimal
import kotlin.math.pow

fun main(args: Array<String>) {
    question17356()
}

fun question17356() {
    val power = readln().split(" ").map { it.toDouble() }
    val addPower = (power[1] - power[0]) / 400
    val result = (1 / (1 + 10.0.pow(addPower))).toString()

    val number = BigDecimal(result)
    println(number.toPlainString())
}