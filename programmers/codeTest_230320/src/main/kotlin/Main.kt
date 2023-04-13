import java.util.concurrent.LinkedBlockingQueue
import kotlin.math.ceil

fun main(args: Array<String>) {
    println("Hello World!")
    var solution = Solution()
    solution.solution(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1))
}

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = arrayListOf<Int>()
        var linkedQueue = LinkedBlockingQueue<Float>()

        //스택 큐? 로 굳이 풀어야 하나?
        progresses.forEachIndexed { index, i ->
            var day = ceil((100 - i).toFloat() / speeds[index])
            println(day)
            linkedQueue.put(day)
        }

        while (!linkedQueue.isEmpty()) {
            var finishedDay = linkedQueue.poll()
            var finished = 1 // 값 하나가 빠지고, 기능 하나가 완료됐음.

            while (!linkedQueue.isEmpty() && linkedQueue.peek() <= finishedDay) {
                linkedQueue.poll()
                finished++
            }

            answer.add(finished)

        }

        println(answer)
        return answer.toIntArray()
    }
}