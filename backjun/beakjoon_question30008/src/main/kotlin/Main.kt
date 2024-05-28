import java.lang.StringBuilder

fun main(args: Array<String>) {
    question30008()
}

fun question30008() {
    val students = readln().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    readln().split(" ").map { it.toInt() }.forEach {
        sb.append(when(it * 100 / students[0]) {
            in 0 .. 4 -> 1
            in 4 + 1 .. 11 -> 2
            in 11 + 1 .. 23 -> 3
            in 23 + 1 .. 40 -> 4
            in 40 + 1 .. 60 -> 5
            in 60 + 1 .. 77 -> 6
            in 77 + 1 .. 89 -> 7
            in 89 + 1 .. 96 -> 8
            in 96 + 1 .. 100 -> 9
            else -> ""
        })
        sb.append(" ")
    }

    println(sb)

}