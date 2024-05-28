import java.lang.StringBuilder

fun main(args: Array<String>) {
    question28453()
}

fun question28453() {
    val count = readln().toInt()
    val sb = StringBuilder()

    readln().split(" ").map { it.toInt() }.forEach {
        sb.append(when(it) {
            in 1 ..< 250 -> 4
            in 250 ..< 275 -> 3
            in 275 ..< 300 -> 2
            else -> 1
        })
        sb.append(" ")
    }

    println(sb)
}