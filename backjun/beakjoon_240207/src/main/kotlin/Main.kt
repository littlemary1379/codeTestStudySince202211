fun main(args: Array<String>) {
    question2839()
}

fun question2839() {
    var kilogram = readln().toInt()

    var max5kg = kilogram / 5

    for (i in max5kg downTo 0) {
        if((kilogram - (5 * i)) % 3 == 0) {
            var max3kg = (kilogram - (5 * i)) / 3
            println(i + max3kg)
            return
        }
    }

    println("-1")
}