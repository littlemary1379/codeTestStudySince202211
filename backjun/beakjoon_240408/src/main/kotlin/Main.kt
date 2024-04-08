import java.util.PriorityQueue

fun main(args: Array<String>) {
    question1655()
}

fun question1655() {
    val count = readln().toInt()
    val minQueue = PriorityQueue<Int>(reverseOrder())
    val maxQueue = PriorityQueue<Int>()
    val stringBuilder = StringBuilder()

    for(i in 1 .. count) {
        val number = readln().toInt()

        if(minQueue.size == maxQueue.size) {
            minQueue.add(number)
        } else {
            maxQueue.add(number)
        }

        if(minQueue.isNotEmpty() && maxQueue.isNotEmpty()) {
            if(minQueue.peek() > maxQueue.peek()) {
                val minPop = minQueue.poll()
                val maxPop = maxQueue.poll()

                maxQueue.add(minPop)
                minQueue.add(maxPop)
            }
        }

        stringBuilder.append("${minQueue.peek()}\n")

    }

    println(stringBuilder)

}