fun main(args: Array<String>) {
    question26068()
}

fun question26068() {
    val count = readln().toInt()
    var needUse = 0
    for(i in 1 .. count) {
        readln().replace("D-", "").toInt().let {
            if (it <= 90) {
                needUse++
            }
        }
    }

    println(needUse)
}