import java.math.BigInteger
import kotlin.math.pow

fun main(args: Array<String>) {
    question15829()
}

fun question15829() {
    val count = readln().toInt()
    val word = readln()
    var integer = BigInteger("0")
    for (i in 0..<count) {
        integer += BigInteger((word[i].code % 96).toString()).multiply(BigInteger("31").pow(i))
    }

    println(integer.mod(BigInteger("1234567891")))

}