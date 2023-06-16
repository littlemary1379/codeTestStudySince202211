fun main(args: Array<String>) {
    var solution = Solution()
    println(solution.solution(9, 91))
}

class Solution {
    fun solution(a: Int, b: Int): Int {

        var addA = "${a}${b}".toInt()
        var addB = "${b}${a}".toInt()
        return if(addA >= addB) {
            addA
        } else {
            addB
        }
    }
}