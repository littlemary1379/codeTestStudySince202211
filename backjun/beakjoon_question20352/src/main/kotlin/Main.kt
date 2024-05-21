import kotlin.math.PI
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question20352()
}

fun question20352() {
    var area = readln().toLong()
    println(sqrt(area.toDouble() / PI) * 2 * PI)
}