import java.math.BigDecimal
import kotlin.math.floor

fun main(args: Array<String>) {
    question26561()
}

fun question26561() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        readln().split(" ").map { it.toDouble() }.let {
            val people = BigDecimal((it[0] + floor(it[1] / 4) - floor(it[1] / 7)).toString())
            println(people.toLong())
        }
    }
}