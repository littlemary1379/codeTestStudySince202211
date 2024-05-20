import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    question16486()
}

fun question16486() {
    val width = readln().toInt()
    val radius = readln().toInt()

    val formatter = DecimalFormat("#.######")
    formatter.roundingMode = RoundingMode.HALF_EVEN

    println(formatter.format(width * 2 + radius * 2 * 3.141592))
}