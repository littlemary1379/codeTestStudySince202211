import java.lang.StringBuilder

fun main(args: Array<String>) {
    question15000()
}

fun question15000() {
    val letter = readln()
    val sb = StringBuilder()

    for(i in letter.indices) {
        sb.append(letter[i].uppercaseChar())
    }

    println(sb)
}