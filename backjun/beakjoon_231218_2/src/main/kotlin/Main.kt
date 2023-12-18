import kotlin.math.sqrt

fun main(args: Array<String>) {
    question2501()
}

fun question2501() {
    val data = readln().trim().split(" ").map { it.toInt() }
    val target = data[0]

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

    if(list.size < data[1]) {
        println(0)
    } else {
        println(list.sorted()[data[1] - 1])
    }
}