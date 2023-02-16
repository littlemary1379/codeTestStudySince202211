fun main(args: Array<String>) {
    solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000))
}

fun solution(k: Int, score: IntArray) : IntArray {
    var answerList = mutableListOf<Int>()
    var priceList = mutableListOf<Int>()

    for(dayScore in score) {
        priceList.add(dayScore)
        priceList.sortDescending()

        if(priceList.size > k) {
            priceList.removeAt(priceList.size - 1)
        }

        answerList.add(priceList.get(priceList.size - 1))
    }

    return answerList.toIntArray()
}