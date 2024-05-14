fun main(args: Array<String>) {
    question11282()
}

fun question11282() {
    val number = readln().toInt() - 1
    val first = number / 21 / 28
    val second = (number - first * (21 * 28)) / 28
    val third = (number - first * (21 * 28) - second * 28)

    val uni = (0xAC00 + (first * 588) + (second * 28) + third).toChar()
    println(uni)

}