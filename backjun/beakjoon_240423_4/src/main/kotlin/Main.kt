import java.text.DecimalFormat

fun main(args: Array<String>) {
    question5355()
}

fun question5355() {
    val count = readln().toInt()

    for (i in 1 .. count) {
        val number = readln().split(" ")

        var result = number[0].toDouble()

        for(j in 1 ..< number.size) {
            when(number[j]) {
                "@" -> result *= 3
                "%" -> result += 5
                "#" -> result -= 7
            }
        }

        val formatter = DecimalFormat("#0.00") // 소수점 두 자리 출력
        val formattedString = formatter.format(result)
        println(formattedString)
    }
}