fun main(args: Array<String>) {
    Solution().solution3(intArrayOf(1, 3, 2, 4, 2)).forEach {
        print("$it ")
    }
}

class Solution {

    fun solution(answers: IntArray): IntArray {

        var answerCountOne = 0
        var answerCountTwo = 0
        var answerCountThree = 0

        for(i in answers.indices) {
            if(i % 5 + 1 == answers[i]) {
                answerCountOne += 1
            }

            if(i % 2 == 0 && answers[i] == 2) {
                answerCountTwo += 1
            } else {
                if((i % 8 == 1 && answers[i] == 1)
                    || (i % 8 == 3 && answers[i] == 3)
                    || (i % 8 == 5 && answers[i] == 4)
                    || (i % 8 == 7 && answers[i] == 5)) {
                    answerCountTwo += 1
                }
            }

            if(((i % 10) / 2 == 0 && answers[i] == 3)
                || ((i % 10) / 2 == 1 && answers[i] == 1)
                || ((i % 10) / 2 == 2 && answers[i] == 2)
                || ((i % 10) / 2 == 3 && answers[i] == 4)
                || ((i % 10) / 2 == 4 && answers[i] == 5)) {
                answerCountThree += 1
            }
        }

        var list = mutableListOf<Int>()
        var answer = intArrayOf(answerCountOne, answerCountTwo, answerCountThree)
        var answerSorting = answer.sortedArrayDescending()
        var max = answerSorting[0]

        for(i in answer.indices) {
            if(answer[i] == max) {
                list.add(i + 1)
            }
        }


        return list.toIntArray()
    }

    fun solution2(answers: IntArray): IntArray {

        var answerOne = intArrayOf(1, 2, 3, 4, 5)
        var answerTwo = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var answerThree = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var oneList = answers.filterIndexed { index, i ->
            i == answerOne[index % 5]
        }

        var twoList = answers.filterIndexed { index, i ->
            i == answerTwo[index % 8]
        }

        var threeList = answers.filterIndexed { index, i ->
            i == answerThree[index % 10]
        }

        var list = mutableListOf<Int>()
        var answer = intArrayOf(oneList.size, twoList.size, threeList.size)
        var answerSorting = answer.sortedArrayDescending()
        var max = answerSorting[0]

        for(i in answer.indices) {
            if(answer[i] == max) {
                list.add(i + 1)
            }
        }

        return list.toIntArray()
    }

    fun solution3(answers: IntArray): IntArray {

        var answerCountOne = 0
        var answerCountTwo = 0
        var answerCountThree = 0

        var answerOne = intArrayOf(1, 2, 3, 4, 5)
        var answerTwo = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var answerThree = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        for(i in answers.indices) {
            if(answers[i] == answerOne[i % 5]) {
                answerCountOne += 1
            }

            if(answers[i] == answerTwo[i % 8]) {
                answerCountTwo += 1
            }

            if(answers[i] == answerThree[i % 10]) {
                answerCountThree += 1
            }
        }

        var list = mutableListOf<Int>()
        var answer = intArrayOf(answerCountOne, answerCountTwo, answerCountThree)
        var answerSorting = answer.sortedArrayDescending()
        var max = answerSorting[0]

        for(i in answer.indices) {
            if(answer[i] == max) {
                list.add(i + 1)
            }
        }


        return list.toIntArray()
    }
}