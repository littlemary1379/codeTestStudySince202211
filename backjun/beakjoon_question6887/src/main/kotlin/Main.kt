import kotlin.math.pow

fun main(args: Array<String>) {
    question6887()
}

fun question6887() {
    val squares = readln().toInt()
    var width = 0.0
    while (width.pow(2) <= squares) {
        width += 1
    }

    println("The largest square has side length ${(width - 1).toInt()}.")
}