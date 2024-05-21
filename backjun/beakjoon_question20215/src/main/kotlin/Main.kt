import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question20215()
}

fun question20215() {
    val length = readln().split(" ").map { it.toDouble() }
    val hypo = sqrt(length[0].pow(2) + length[1].pow(2))
    val format = DecimalFormat("0.#########")

    println(format.format(length.sum() - hypo))
}