import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    question1735()
}

fun question1735() {
    val first = readln().split(" ").map { it.toInt() }.toMutableList()
    val second = readln().split(" ").map { it.toInt() }.toMutableList()

    val commonMultiple = euclideanAlgorithm(first[1], second[1], true)
    val firstNum = first[0] * (commonMultiple / first[1])
    val secondNum = second[0] * (commonMultiple / second[1])

    var num = firstNum + secondNum
    var denom = commonMultiple

    val commonDivisor = euclideanAlgorithm(num, denom, false)
    println("${num/commonDivisor} ${denom/commonDivisor}")
}

// 유클리드 호제법(isMuliple = true -> 최소공배수, false -> 최대공약수)
fun euclideanAlgorithm(a : Int, b: Int, isMultiple : Boolean) : Int {
    var cloneA = a
    var cloneB = b

    val result : Int
    while (true) {
        val remain = cloneA % cloneB
        if(remain == 0) {
            result = cloneB
            break
        } else {
            cloneA = cloneB
            cloneB = remain
        }
    }

    return if (isMultiple) {
        val calA = a / result
        val calB = b / result

        result * calA * calB
    } else {
        result
    }

}


// 3초 이상 걸림
//fun question1735() {
//    var first = readln().split(" ").map { it.toInt() }
//    var second = readln().split(" ").map { it.toInt() }
//
//    // 분자
//    var num = first[0] * second[1] + second[0] * first[1]
//    // 분모
//    var denom = first[1] * second[1]
//
//    var count = 2
//    while (num / count != 0 || denom / count != 0 ) {
//        if(num % count == 0 && denom % count == 0) {
//            num /= count
//            denom /= count
//            count = 2
//        } else {
//            count ++
//        }
//    }
//
//    println(num)
//    println(denom)
//}