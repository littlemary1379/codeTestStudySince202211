fun main(args: Array<String>) {
    question26495()
}

fun question26495() {
    val letter0 = "0000\n0  0\n0  0\n0  0\n0000"
    val letter1 = "   1\n   1\n   1\n   1\n   1"
    val letter2 = "2222\n   2\n2222\n2\n2222"
    val letter3 = "3333\n   3\n3333\n   3\n3333"
    val letter4 = "4  4\n4  4\n4444\n   4\n   4"
    val letter5 = "5555\n5\n5555\n   5\n5555"
    val letter6 = "6666\n6\n6666\n6  6\n6666"
    val letter7 = "7777\n   7\n   7\n   7\n   7"
    val letter8 = "8888\n8  8\n8888\n8  8\n8888"
    val letter9 = "9999\n9  9\n9999\n   9\n   9"

    readln().forEach {
        println(when(it) {
            '0' -> letter0
            '1' -> letter1
            '2' -> letter2
            '3' -> letter3
            '4' -> letter4
            '5' -> letter5
            '6' -> letter6
            '7' -> letter7
            '8' -> letter8
            '9' -> letter9
            else -> ""
        })
        println()

    }
}