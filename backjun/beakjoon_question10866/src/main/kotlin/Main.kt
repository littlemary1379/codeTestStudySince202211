fun main(args: Array<String>) {
    question10866()
}

fun question10866() {
    val deque = ArrayDeque<String>()
    val count = readln().toInt()
    val stringBuilder = StringBuilder()
    for(i in 1 .. count) {
        val commend = readln().split(" ")
        when(commend[0]) {
            "push_front" -> {
                deque.addFirst(commend[1])
            }

            "push_back" -> {
                deque.addLast(commend[1])
            }

            "pop_front" -> {
                stringBuilder.append(if(deque.isEmpty()) -1 else deque.removeFirst())
                stringBuilder.append("\n")
            }

            "pop_back" -> {
                stringBuilder.append(if(deque.isEmpty()) -1 else deque.removeLast())
                stringBuilder.append("\n")
            }

            "size" -> {
                stringBuilder.append(deque.size)
                stringBuilder.append("\n")
            }

            "empty" -> {
                stringBuilder.append(if(deque.isEmpty()) 1 else 0)
                stringBuilder.append("\n")
            }

            "front" -> {
                stringBuilder.append(if(deque.isEmpty()) -1 else deque.first())
                stringBuilder.append("\n")
            }

            "back" -> {
                stringBuilder.append(if(deque.isEmpty()) -1 else deque.last())
                stringBuilder.append("\n")
            }
        }

    }

    println(stringBuilder)
}