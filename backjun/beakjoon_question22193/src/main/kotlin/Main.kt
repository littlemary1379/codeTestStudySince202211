import java.math.BigInteger

fun main(args: Array<String>) {
    question22193()
}

fun question22193() {
    val count = readln().split(" ")

    var number = BigInteger("1")
    for(i in 1 .. count.size) {
        number = number.multiply(BigInteger(readln()))
    }

    println(number)
}