import kotlin.math.floor
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question4134()
}

fun question4134() {
    val count = readln().toInt()
    for (i in 1..count) {
        var case = readln().toLong()
        caseLoop@ while (true) {
            if(case == 1L || case == 0L) {
                case += 1
                continue@caseLoop
            }
            val caseSqrt = sqrt(case.toDouble())
            val floorSqrt = floor(caseSqrt).toInt()
            for(j in 2 .. floorSqrt) {
                if(case % j == 0L) {
                    case += 1
                    continue@caseLoop
                }
            }

            println("${case.toLong()}")
            break@caseLoop

        }
    }
}