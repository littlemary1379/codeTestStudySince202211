fun main(args: Array<String>) {
   var solution = Solution()
    //solution.solution("He11oWor1d", "lloWorl",2)
    solution.solution("Program29b8UYP", "merS123",7)
}

class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = my_string.replaceRange(s, s + overwrite_string.length, overwrite_string)
        return answer
    }
}