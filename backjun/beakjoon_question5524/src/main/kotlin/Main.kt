import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    question5524()
}

fun question5524() {
    val count = readln().toInt()
    val sb = StringBuilder()
    for (i in 1 .. count) {
        sb.append("${readln().lowercase(Locale.getDefault())}\n")
    }

    println(sb)
}