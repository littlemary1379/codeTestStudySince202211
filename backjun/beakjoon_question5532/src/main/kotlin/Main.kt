import kotlin.math.ceil
import kotlin.math.max

fun main(args: Array<String>) {
    question5532()
}

fun question5532() {
    val period = readln().toInt()
    val koreanHw = readln().toInt()
    val mathHw = readln().toInt()
    val koreanDo = readln().toInt()
    val mathDo = readln().toInt()

    println("${(period - (max(ceil(koreanHw.toDouble() / koreanDo), ceil(mathHw.toDouble() / mathDo)))).toInt()}")

}