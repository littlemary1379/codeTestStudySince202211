fun main(args: Array<String>) {
    question1284()
}

fun question1284() {
    while (true) {
        val number = readln()
        if(number == "0") {
            break
        } else {
            // 양쪽 여백 + 사이여백 + 1여백 + 0여백 + 나머지여백
            val empty = 2 + (number.count() - 1) +
                    (number.count { it == '1' } * 2) + (number.count { it == '0' } * 4) + (number.count { it != '1' && it != '0' } * 3)
            println(empty)
        }
    }
}