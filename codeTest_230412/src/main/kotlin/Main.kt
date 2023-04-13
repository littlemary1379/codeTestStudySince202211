fun main(args: Array<String>) {
    var solution = Solution()
    println(solution.solution(arrayOf("banana", "apple", "rice", "pork", "pot"),
        intArrayOf(3, 2, 2, 2, 1),
        arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")
    ))

}

class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0

        discount.forEachIndexed discountLoop@{ index, _ ->
            var endDiscount = if (index + 10 <= discount.size) {
                // 10개를 세려면 9개를 더해야함.
                index + 9
            } else {
                discount.size - 1
            }

            var list = discount.slice(index .. endDiscount)

            want.forEachIndexed { wantIndex, s ->
                if(list.count { it == s } != number[wantIndex]) {
                    // 수량 안 맞으면 어차피 이 기간에 회원가입을 못함. 보자마자 할인 루프 종료
                    return@discountLoop
                }
            }

            answer += 1
        }


        return answer
    }
}