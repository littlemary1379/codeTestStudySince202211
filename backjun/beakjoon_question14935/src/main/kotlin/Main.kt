import java.math.BigInteger
import kotlin.math.pow

fun main(args: Array<String>) {
    question14935()
}

fun question14935() {
    val number = BigInteger(readln())
    var fa = number

    while (true) {
        val calNumber = (fa.divide(BigInteger(10.0.pow(number.toString().length - 1).toInt().toString()))).multiply(BigInteger(number.toString().length.toString()))
        if(calNumber == fa) {
            println("FA")
            break
        } else {
            fa = calNumber
        }

    }

}