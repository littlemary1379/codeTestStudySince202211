import java.math.BigInteger

fun main(args: Array<String>) {
    question15740()
}

fun question15740() {
    val numbers = readln().split(" ").map { BigInteger(it) }
    println(numbers[0].add(numbers[1]))
}