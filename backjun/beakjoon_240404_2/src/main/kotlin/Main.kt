import java.util.LinkedList

fun main(args: Array<String>) {
    question2164()
}

fun question2164() {
    val queue = LinkedList<Int>()
    val count = readln().toInt()
    for(i in 1 .. count) {
        queue.add(i)
    }

    while(queue.size > 1) {
        queue.poll()
        queue.add(queue.poll())
    }

    println(queue.first)
}