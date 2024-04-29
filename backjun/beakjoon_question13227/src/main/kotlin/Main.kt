import java.math.BigInteger

fun main(args: Array<String>) {
    question13277()
}

fun question13277() {
    val numbers = readln().split(" ").map{ BigInteger(it) }
    println(numbers[0].multiply(numbers[1]))
}