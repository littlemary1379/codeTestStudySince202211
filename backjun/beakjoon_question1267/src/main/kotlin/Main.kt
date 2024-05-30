import kotlin.math.ceil
import kotlin.math.min

fun main(args: Array<String>) {
    question1267()
}

fun question1267() {
    val count = readln().toInt()
    readln().split(" ").map { it.toDouble() }.let {
        val y = it.sumOf { price -> ceil((price + 1) / 30).toInt() } * 10
        val m = it.sumOf { price -> ceil((price + 1) / 60).toInt() } * 15

        val sentence = "${if(y < m) "Y" else if(m < y) "M" else "Y M"} ${min(y, m)}"
        println(sentence)

    }
}