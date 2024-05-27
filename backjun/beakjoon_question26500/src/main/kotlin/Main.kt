import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.abs

fun main(args: Array<String>) {
    question26500()
}

fun question26500() {
    val count = readln().trim().toInt()
    for(i in 1 .. count) {
        readln().trim().split(" ").map { it.toDouble() }.let {
            val abs = abs(it[1] - it[0])
            println(BigDecimal(abs.toString()).setScale(1, RoundingMode.HALF_EVEN))
        }
    }
}