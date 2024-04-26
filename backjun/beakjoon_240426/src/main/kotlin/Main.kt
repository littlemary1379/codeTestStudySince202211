import kotlin.math.pow

fun main(args: Array<String>) {
    question2475()
}

fun question2475() {
    val number = readln().split(" ").map { it.toInt() }
    var sqrtAdd = 0
    number.forEach {
        sqrtAdd += (it.toDouble().pow(2.0)).toInt()
    }

    println(sqrtAdd % 10)
}