fun main(args: Array<String>) {
    question11283()
}

fun question11283() {
    val char = readln().toCharArray()[0].code
    val firstIndex = (char - 0xAC00) / 588
    val secondIndex = (char - 0xAC00 - firstIndex * 588) / 28
    val thirdIndex = (char - 0xAC00 - firstIndex * 588 - secondIndex * 28)

    println(firstIndex * 21 * 28 + secondIndex * 28 + thirdIndex + 1)
}