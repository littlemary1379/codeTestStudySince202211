import java.math.BigInteger

fun main(args: Array<String>) {
    question2338()
}

fun question2338() {
    val num1 = BigInteger(readln())
    val num2 = BigInteger(readln())

    println(num1.add(num2))
    println(num1.minus(num2))
    println(num1.multiply(num2))
}