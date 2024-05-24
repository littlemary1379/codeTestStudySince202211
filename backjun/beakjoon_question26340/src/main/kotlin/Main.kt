import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    question26340()
}

fun question26340() {
    val count = readln().toInt()
    for (i in 1 .. count) {
        var length = readln().split(" ").map { it.toInt() }.toMutableList()
        println("Data set: ${length.joinToString(" ") }")
        for (j in 1 .. length[2]) {
            if(length[0] > length[1]) {
                length[0] /= 2
            } else {
                length[1] /= 2
            }
        }
        println("${max(length[0], length[1])} ${min(length[0], length[1])}")
        println()
    }
}
