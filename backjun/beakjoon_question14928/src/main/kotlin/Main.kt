fun main(args: Array<String>) {
    question14928()
}

fun question14928() {
    var number = readln()

    var remain = 0
    for (i in number.indices) {
        remain = (remain * 10 + (number[i].toString().toInt())) % 20000303
    }

    println(remain)
}