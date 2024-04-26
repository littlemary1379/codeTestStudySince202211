fun main(args: Array<String>) {
    question5341()
}

// 카드 게임
fun question5341() {
    while (true) {
        val number = readln().toInt()
        if(number == 0) {
            break
        } else {
            var addAll = 0
            for (i in 1 .. number) {
                addAll += i
            }
            println(addAll)
        }
    }
}