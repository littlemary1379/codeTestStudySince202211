import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    question26566()
}

fun question26566() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        val piece = readln().split(" ").map { it.toDouble() }.let {
            it[1] / it[0]
        }
        val whole = readln().split(" ").map { it.toDouble() }.let {
            it[1] / (it[0].pow(2) * PI)
        }

        println(if(piece < whole) "Slice of pizza" else "Whole pizza" )

    }
}