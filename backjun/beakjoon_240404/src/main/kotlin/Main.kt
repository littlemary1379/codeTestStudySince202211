import java.util.*

fun main(args: Array<String>) {
    question18258()
}

fun question18258() {
    val count = readln().toInt()
    val queue = LinkedList<Int>()
    val stringBuilder = StringBuilder()

    for (i in 1..count) {
        val commendList = readln().split(" ")
        when (val commend = commendList[0]) {
            "push" -> {
                queue.add(commendList[1].toInt())
                continue
            }
            "pop", "front", "back" -> {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1")
                } else {
                    when (commend) {
                        "pop" -> {
                            stringBuilder.append(queue.poll())
                        }

                        "front" -> {
                            stringBuilder.append(queue.peek())
                        }

                        else -> {
                            stringBuilder.append(queue[queue.size - 1])
                        }
                    }
                }
            }

            "empty" -> stringBuilder.append(if (queue.isEmpty()) 1 else 0)
            "size" -> stringBuilder.append(queue.size)
        }

        stringBuilder.append("\n")

    }

    println(stringBuilder.toString())
}