import kotlin.math.ceil

fun main(args: Array<String>) {
    var solution = Solution()
    println(solution.solution(intArrayOf(1, 2, 1, 4, 1, 3, 1, 2)))
    println("--------------- case change ---------------")
    println(solution.solution(intArrayOf(1, 2, 3, 1, 4)))
//    println(solution.solution(intArrayOf(1, 2, 3, 4, 2, 1)))
//    println(solution.solution(intArrayOf(1, 2, 1, 2, 1, 2)))
//    println(solution.solution(intArrayOf(1, 2, 3)))
}

class Solution {
    fun solution(topping: IntArray): Int {

        var answer = 0

        var hashMap = HashMap<Int, Int>()
        var hashSet = HashSet<Int>()

        topping.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }

        topping.forEach {
            hashSet.add(it)

            hashMap[it] = hashMap[it]!! - 1

            if (hashMap[it] == 0) {
                hashMap.remove(it)
            }

            if(hashSet.size == hashMap.count()) {
                answer += 1
            }

        }

        return answer

    }
}