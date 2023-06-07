fun main(args: Array<String>) {
    question10988()
}

fun question10988() {
    var word = readLine()!!
    var reverseWord = word.reversed()

    println(
        if (word == reverseWord) {
            1
        } else {
            0
        }
    )
}