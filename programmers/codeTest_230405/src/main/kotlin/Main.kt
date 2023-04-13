fun main(args: Array<String>) {
    var solution = Solution()
    println(solution.solution("3people     unFollowed    me     "))
}

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var array = s.split(" ")

        array.forEachIndexed { index, s ->
            var doString =
            if(s.isEmpty()) {
                ""
            } else {
                "${s[0].uppercase()}${s.subSequence(1, s.length).toString().lowercase()}"
            }
            answer += "$doString "
        }

        return answer.substring(range = 0 .. answer.length - 2)
    }
}