fun main(args: Array<String>) {
    question1476()
}

fun question1476() {
    // 15 28 19
    val time = readln().split(" ").map { it.toInt() }

    var count = 0
    while (true) {

        // E의 값으로 나머지를 판단하여 맞을 때까지 확인함
        val calTime = count * 15 + time[0]

        val time28 = if(time[1] == 28) 0 else time[1]
        val time19 = if(time[2] == 19) 0 else time[2]

        if((calTime % 28 == time28) && (calTime % 19 == time19)) {
            println("${calTime}")
            break
        } else {
            count++

        }

    }

}