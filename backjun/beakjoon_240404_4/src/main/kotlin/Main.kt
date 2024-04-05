fun main(args: Array<String>) {
    question28279()
}

fun question28279() {

    val deque = ArrayDeque<Int>()
    val count = readln().toInt()
    val stringBuilder = StringBuilder()

    for(i in 1 .. count) {
        val commendList = readln().split(" ")
        when(val commend = commendList[0]) {
            "1", "2" -> {
                if(commend == "1") {
                    deque.addFirst(commendList[1].toInt())
                } else {
                    deque.addLast(commendList[1].toInt())
                }
                continue
            }

            "3", "4", "7", "8" -> {
                if(deque.isEmpty()) {
                    stringBuilder.append("-1")
                } else {
                    when(commend) {
                        "3" -> stringBuilder.append(deque.removeFirst())
                        "4" -> stringBuilder.append(deque.removeLast())
                        "7" -> stringBuilder.append(deque.first())
                        "8" -> stringBuilder.append(deque.last())
                    }
                }
            }

            "5" -> stringBuilder.append(deque.size)
            "6" -> stringBuilder.append(if(deque.isEmpty()) 1 else 0)

        }

        stringBuilder.append("\n")
    }

    println(stringBuilder)
}