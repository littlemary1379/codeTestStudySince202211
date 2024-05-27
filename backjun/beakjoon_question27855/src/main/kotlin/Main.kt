import kotlin.math.abs

fun main(args: Array<String>) {
    question27855()
}

fun question27855() {
    val first = readln().split(" ").map { it.toInt() }.let {
        it[0] * 3 + it[1]
    }
    val second = readln().split(" ").map { it.toInt() }.let {
        it[0] * 3 + it[1]
    }

    if(first == second) {
        println("NO SCORE")
    } else {
        println("${if(first > second) 1 else 2} ${abs(first - second)}")
    }
}