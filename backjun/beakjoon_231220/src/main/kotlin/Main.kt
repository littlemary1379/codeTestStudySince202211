import kotlin.math.ceil
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question2581()
}

fun question2581() {

    var min = readln().toInt()
    var max = readln().toInt()

    // 1. 크기만큼의 구멍 준비
    var eratosArray : Array<Boolean> = Array(max + 1) { true }

    // 2. 0과 1은 소수이므로 false로 전환
    eratosArray[0] = false
    eratosArray[1] = false

    // 3. 가장 큰 값의 제곱근을 구함.
    var listSqrt = ceil(sqrt(max.toDouble())).toInt()

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

    var total = 0
    var maximize = 0

    for(i in min .. max ) {
        if(eratosArray[i]) {
            total += i
            if(maximize == 0) maximize = i
        }
    }

    if(total == 0) {
        println(-1)
    } else {
        println(total)
        println(maximize)
    }

}