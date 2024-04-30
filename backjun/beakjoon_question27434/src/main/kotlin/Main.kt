import java.math.BigInteger
import kotlin.math.ceil

fun main(args: Array<String>) {
    question27434()
}

fun question27434() {
    val count = readln().toInt()

    println(fact(1, count))
}

// https://velog.io/@dangdang/%EB%B0%B1%EC%A4%80-27434
fun fact(a: Int, n: Int): BigInteger {
    var ret = BigInteger.valueOf(a.toLong())
    if (a < n) {
        val b = (a + n) / 2
        ret = fact(a, b).multiply(fact(b + 1, n)) //두개로 나눠서 풀이
    }
    return ret
}