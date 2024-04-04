import java.util.LinkedList

fun main(args: Array<String>) {
    question11866()
}

fun question11866() {
    val queue = LinkedList<Int>()
    val removeList = mutableListOf<Int>()
    val question = readln().split(" ").map { it.toInt() }
    var count = 1
    for (i in 1 .. question[0]) {
        queue.add(i)
    }

    while (queue.size != 0) {
        if(count != question[1]) {
            queue.add(queue.poll())
            count++
        } else {
            removeList.add(queue.poll())
            count = 1
        }
    }

    println("<${removeList.joinToString(", ")}>")
}