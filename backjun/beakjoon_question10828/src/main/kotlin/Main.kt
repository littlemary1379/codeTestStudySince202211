import java.util.Stack

fun main(args: Array<String>) {
    question10828()
}

fun question10828() {
    val count = readln().toInt()
    val stack = Stack<String>()
    val stringBuilder = StringBuilder()

    for (i in 1..count) {
        val commend = readln().split(" ")
        when (commend[0]) {
            "push" -> stack.push(commend[1])
            "pop" -> {
                if (stack.isEmpty()) {
                    stringBuilder.append("-1\n")
                } else {
                    stringBuilder.append("${stack.pop()}\n")
                }
            }
            "size" -> stringBuilder.append("${stack.size}\n")
            "empty" -> stringBuilder.append(if(stack.isEmpty()) "1\n" else "0\n")
            "top" -> {
                if (stack.isEmpty()) {
                    stringBuilder.append("-1\n")
                } else {
                    stringBuilder.append("${stack.peek()}\n")
                }
            }
        }
    }

    println(stringBuilder)
}