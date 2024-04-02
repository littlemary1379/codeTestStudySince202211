import java.util.Stack

fun main(args: Array<String>) {
    question10773()
}

fun question10773() {
    val count = readln().toInt()
    val stack = Stack<Int>()
    for (i in 1 .. count) {
        val number = readln().toInt()
        if(number == 0) {
            if(stack.isNotEmpty()) {
                stack.pop()
            }
        } else {
            stack.push(number)
        }
    }

    println(stack.sum())
}