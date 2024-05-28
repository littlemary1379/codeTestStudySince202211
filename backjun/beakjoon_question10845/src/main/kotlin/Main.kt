import java.util.LinkedList

fun main(args: Array<String>) {
    question10845()
}

fun question10845() {
    val count = readln().toInt()
    val queue = LinkedList<String>()

    for(i in 1 .. count) {
        readln().split(" ").let {
            when(it[0]) {
                "push" -> queue.add(it[1])
                "pop" -> println(if(queue.isEmpty()) -1 else queue.pop())
                "size" -> println(queue.size)
                "empty" -> println(if(queue.isEmpty()) 1 else 0)
                "front" -> println(if(queue.isEmpty()) -1 else queue.first)
                "back" -> println(if(queue.isEmpty()) -1 else queue.last)
                else -> {}
            }
        }
    }
}