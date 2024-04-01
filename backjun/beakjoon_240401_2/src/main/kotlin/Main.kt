import java.lang.StringBuilder
import java.util.Stack

fun main(args: Array<String>) {
    question28278()
}

fun question28278() {
    val count = readln().toInt()
    val stack = Stack<String>()

    val sb = StringBuilder()

    for(i in 1 .. count) {
        val commend = readln().split(" ")
        when(commend[0]) {
            "1" -> stack.push(commend[1])
            "2" -> sb.append(if(stack.isEmpty()) {
                "-1"
            } else {
                stack.pop()
            } + "\n")
            "3" -> sb.append(stack.size.toString() + "\n")
            "4" -> sb.append((if(stack.isEmpty()) "1" else "0") + "\n")
            "5" -> sb.append(if(stack.isEmpty()) {
                "-1"
            } else {
                stack.peek()
            } + "\n")
            else -> {}
        }
    }

    println(sb)
}