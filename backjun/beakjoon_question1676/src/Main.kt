import java.math.BigInteger
import kotlin.math.log
import kotlin.math.sqrt

fun main() {
    question1676()
}

fun question1676() {
    val number = readln().toInt()
    var zeroNumber = 0
    for(i in 1 .. number) {
        if(i % 5 == 0) {
            var modNumber = i
            var addNumber = 0
            while (modNumber % 5 == 0) {
                modNumber /= 5
                addNumber += 1
            }

            zeroNumber += addNumber
        }
    }

    println(zeroNumber)
}