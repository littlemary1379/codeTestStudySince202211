import java.math.BigInteger
import kotlin.math.ceil

fun main(args: Array<String>) {
    question13136()
}

fun question13136() {
    val stage = readln().split(" ").map { it.toDouble() }
    val width = ceil(stage[0] / stage[2]).toInt().toString()
    val height = ceil(stage[1] / stage[2]).toInt().toString()

    println(BigInteger(width).multiply(BigInteger(height)))
}