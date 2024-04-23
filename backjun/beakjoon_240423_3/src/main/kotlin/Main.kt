import java.lang.Math.pow
import kotlin.math.pow
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    question1748()
}

fun question1748() {
    val number = readln().toInt()

    // 결과
    var addNum = 0L

    var calNum = number
    var square = 1
    while (calNum / 10 != 0) {
        calNum /= 10
        square++
    }

    val leftNum = if(square == 1) {
        (number - 1).toLong()
    } else {
        number - 10.0.pow((square - 1).toDouble()).toLong()
    }

    // 자릿수 -1 까지는 모든 수가 다 있음
    for (i in 1 ..< square) {
        val mustAdd = i * 9 * 10.0.pow((i - 1).toDouble()).toLong()
        addNum += mustAdd
    }

    var leftAddNum = (leftNum + 1L) * square
    addNum += leftAddNum

    println(addNum)

    var compareNum = 0
    for (i in 1.. number) {
        compareNum += i.toString().length
    }

    println(compareNum)

}