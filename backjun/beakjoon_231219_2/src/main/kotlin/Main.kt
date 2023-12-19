import kotlin.math.ceil
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question1978()
}

fun question1978() {
    var count = readln()
    var list = readln().split(" ").map { it.toInt() }.sorted()

    var total = 0

    // list를 sort 한 뒤에, 에라토스테네스의 체로 가장 큰 값까지의 소수를 전부 구해두고 빼기.
    // 에라토스테네스의 체
    // 1. 크기만큼의 구멍 준비
    var eratosArray : Array<Boolean> = Array(list.last() + 1) { true }

    // 2. 0과 1은 소수이므로 false로 전환
    eratosArray[0] = false
    eratosArray[1] = false

    // 3. 가장 큰 값의 제곱근을 구함.
    var listSqrt = ceil(sqrt(list.last().toDouble())).toInt()

    //4. 해당값이 소수라면 소수를 제외한 값을 죄다 날릴 수 있다
    for (i in 2 .. listSqrt) {
        if(eratosArray[i]) {
            var j = 2
            while (i * j < eratosArray.size) {
                eratosArray[i * j] = false
                j ++
            }
        }
    }

    // 5. 구해진 구멍과 일치하는지 확인
    list.forEach {
        if(eratosArray[it]) {
            total ++
        }
    }

    println(total)

}