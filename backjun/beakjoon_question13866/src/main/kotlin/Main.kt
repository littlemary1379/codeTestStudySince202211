import kotlin.math.abs

fun main(args: Array<String>) {
    question13866()
}

fun question13866() {
    val person = readln().split(" ").map { it.toInt() }
    println(abs((person[0] + person[3]) - (person[1] + person[2])))
}