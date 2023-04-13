fun main(args: Array<String>) {
    var num = 6
    var total = 9

    var answer = IntArray(num)

    if(num % 2 == 1) {
        //num이 홀수라면 total / num 할 시 가장 중간 값이 나옴
        var median = total / num
        //나누기 2하면 가장 최소 - 최대 값들이 나오게 된다.
        //ex. num이 3이라면 num/2 = 1이기 때문에, median에서 -1 0 1이 나오게 된다.
        var minimunDiff = -(num/2)
        for(i in answer.indices) {
            answer[i] = median + minimunDiff
            minimunDiff += 1
        }
    } else {
        //num이 짝수라면 total / (num/2)하면 가장 중간 2개의 값을 합한 값이 나온다.
        //num에서 -2 한 후 /2 하면 가장 중간 2개의 값을 기점으로 가장 최소의 - 최대값이 보이는지 나오게 되는데,
        //중간 2개의 값 중 앞의 숫자를 기점으로 쭉 for문을 돌리면 완벽 ㅇ.<
        var firstMedian = (total / (num / 2)) / 2
        var minimunDiff = -((num - 2) / 2)
        for(i in answer.indices) {
            answer[i] = firstMedian + minimunDiff
            minimunDiff += 1
        }

    }

    for(i in 0 until answer.size) {
        println("answer $i : ${answer[i]}")
    }
}