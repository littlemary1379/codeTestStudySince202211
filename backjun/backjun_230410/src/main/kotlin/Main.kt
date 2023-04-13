import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {
    question2480()
}

fun question2480() {
    var sc = Scanner(System.`in`)
    var diceList = sc.nextLine().split(" ").map { it.toInt() }
    var maxList = Array<Int>(3) {0}

    diceList.forEachIndexed { index, i ->
        maxList[index] = diceList.count { it == i }
    }

    if(maxList.max() == 3) {
        println(10000 + diceList[0] * 1000)
    } else if(maxList.max() == 2) {
        println(1000 + diceList[maxList.indexOf(2)] * 100)
    } else {
        println(diceList.max() * 100)
    }
}