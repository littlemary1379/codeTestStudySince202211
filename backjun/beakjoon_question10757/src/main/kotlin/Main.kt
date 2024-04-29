import java.math.BigInteger

fun main(args: Array<String>) {
    question10757()
}

fun question10757() {
    val number = readln().split(" ").map { BigInteger(it) }
    println(number[0].add(number[1]))
}