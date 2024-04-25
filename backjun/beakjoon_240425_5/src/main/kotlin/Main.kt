import java.math.BigInteger

fun main(args: Array<String>) {
    question1271()
}

fun question1271() {
    val aliveList = readln().split(" ")

    val money = BigInteger(aliveList[0])
    val alive = BigInteger(aliveList[1])

    println(money.divide(alive))
    println(money.remainder(alive))

}