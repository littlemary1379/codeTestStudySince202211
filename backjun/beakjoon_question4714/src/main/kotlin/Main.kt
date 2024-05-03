import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    question4714()
}

fun question4714() {
    while(true) {
        val weight = readln().toDouble()

        if(weight < 0) {
            break
        }

        val formatter = DecimalFormat("0.00")
        formatter.roundingMode = RoundingMode.HALF_EVEN
        println("Objects weighing ${formatter.format(weight)} on Earth will weigh ${formatter.format(weight * 0.167)} on the moon.")
    }
}