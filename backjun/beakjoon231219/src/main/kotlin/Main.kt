import kotlin.math.sqrt

fun main(args: Array<String>) {
    question9506()
}

fun question9506() {
    while (true) {
        val data = readln().toInt()
        if(data == -1) {
            break
        } else {
            val divisorList = getDivisor(data)
            var totalSum = 0
            var totalString = ""

            for(i in 0 .. divisorList.size - 2) {
                val targetNumber = divisorList[i]
                totalSum += targetNumber
                if (targetNumber == 1) totalString += targetNumber else totalString += " + $targetNumber"
            }

            if(totalSum == data) {
                println("$data = $totalString")
            } else {
                println("$data is NOT perfect. ")
            }
        }
    }
}

//2501(beakjoon_231218_2)의 약수 구하는 법 차용
fun getDivisor(target : Int) : List<Int> {

    var list : MutableList<Int> = mutableListOf()

    // 어차피 제곱근값 해도 약수 다 구해짐. 데칼코마니 같은 거.
    for(i in 1..sqrt(target.toDouble()).toInt()) {
        if(target % i == 0) {
            // 해당값의 약수는, 몫도 약수가 된다.
            list.add(i)
            if(target / i != i) {
                list.add(target / i)
            }
        }
    }

    return list.sorted()

}