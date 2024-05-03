import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.pow

fun main(args: Array<String>) {
    question4696()
}

fun question4696() {

    while (true) {
        val percent = readln().toDouble()
        if(percent == 0.0) {
            break
        } else {
            val all = 1 + percent + percent.pow(2) + percent.pow(3) + percent.pow(4)
            val formatter = DecimalFormat("#.00")
            formatter.roundingMode = RoundingMode.HALF_EVEN
            println(formatter.format(all))
        }
    }
}