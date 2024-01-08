import kotlin.math.max

fun main(args: Array<String>) {
    question14215()
}

fun question14215() {
    var line = readln().split(" ").map { it.toInt() }

    if(line.sum() > line.max() * 2) {
        println(line.sum())
    } else {
        var maxLine = line.sum() - line.max()
        println("${maxLine * 2 - 1}")
    }
}