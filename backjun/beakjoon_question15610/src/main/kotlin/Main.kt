import java.text.DecimalFormat
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question15610()
}

fun question15610() {
    val area = readln().toDouble()
    val length = sqrt(area) * 4

    val formatter = DecimalFormat("0.0#######")
    println(formatter.format(length))
}