import java.lang.StringBuilder

fun main(args: Array<String>) {
    question5300()
}

fun question5300() {
    val count = readln().toInt()
    val sb = StringBuilder()
    for(i in 1 .. count) {
        sb.append("$i ")
        if(i % 6 == 0 || i == count) {
            sb.append("Go! ")
        }
    }

    println(sb.trim())
}