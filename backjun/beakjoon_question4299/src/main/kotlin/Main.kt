import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    question4299()
}

fun question4299() {
    var plusMinus = readln().split(" ").map { it.toInt() }

    // x+y = plusMiuns[0], x-y = plusMiuns[1]
    if(plusMinus.sum() % 2 != 0) {
        println("-1")
        return
    } else {
        val x = plusMinus.sum() / 2
        val y = x - plusMinus[1]

        if(x < 0 || y < 0) {
            println("-1")
        } else {
            println("${max(x, y)} ${min(x, y)}")
        }
    }


}