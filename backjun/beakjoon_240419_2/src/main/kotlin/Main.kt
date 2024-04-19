fun main(args: Array<String>) {
    question2609()
}

fun question2609() {
    val numbers = readln().split(" ").map { it.toInt() }

    var a = numbers[0]
    var b = numbers[1]

    val result: Int
    while (true) {
        val remain = a % b
        if(remain == 0) {
            result = b
            break
        } else {
            a = b
            b = remain
        }
    }

    println("${result}")
    println("${result * (numbers[1] / result) * (numbers[0] / result)}")


}