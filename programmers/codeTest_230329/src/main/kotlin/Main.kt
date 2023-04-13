import java.util.Arrays

fun main(args: Array<String>) {
    println("Hello World!")

    println(solution2(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)))
}

fun solution(k: Int, tangerine: IntArray): Int {

    var answer = k
    var count = 0

    var tangerineSize = tangerine.distinct()
    var tangerineCount = IntArray(tangerineSize.size)

    tangerineSize.forEachIndexed { index, i ->
        tangerineCount[index] = test(tangerine, i)
    }

    tangerineCount.sortedDescending().forEach {

        if(answer > it) {
            answer -= it
            count++
        } else {
            return if(answer > 0) {
                count + 1
            } else {
                count
            }
        }

    }

    return 0
}

fun test(tangerine: IntArray, filter : Int) : Int {

    var count = 0

    tangerine.forEach {
        if(it == filter) count++
    }

    return count
}

fun solution2(k: Int, tangerine: IntArray): Int {

    println(tangerine.groupBy { it }.toList().sortedByDescending { it.second.size })


    return 0
}