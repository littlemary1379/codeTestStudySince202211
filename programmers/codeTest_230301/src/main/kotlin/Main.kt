fun main(args: Array<String>) {
    solution(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(7, 8, 9, 10, 11, 12)).forEach {
        println(it)
    }
}

fun solution(lottos: IntArray, win_nums: IntArray): IntArray {

    var answer = IntArray(2)

    var realAnswer = 0
    var unKnownAnswer = 0

    lottos.forEach {
        if(it == 0) {
            unKnownAnswer += 1
        } else {
            if(win_nums.contains(it)) {
                realAnswer += 1
            }
        }
    }

    answer[0] = if((realAnswer + unKnownAnswer) > 0) {
        6 - (realAnswer + unKnownAnswer) + 1
    } else {
        6 - (realAnswer + unKnownAnswer)
    }
    answer[1] = if(realAnswer > 0) {
            6 - realAnswer + 1
        } else {
            6 - realAnswer
        }

    return answer
}