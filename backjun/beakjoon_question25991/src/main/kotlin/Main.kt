import java.text.DecimalFormat
import kotlin.math.cbrt
import kotlin.math.pow

fun main(args: Array<String>) {
    question25991()
}

fun question25991() {
    val count = readln().toInt()
    val liters = readln().split(" ").map { it.toDouble() }
    var allLiter = 0.0
    liters.forEach {
        allLiter += it.pow(3)
    }

    val format = DecimalFormat("0.##########")
    println(format.format(cbrt(allLiter)))
}