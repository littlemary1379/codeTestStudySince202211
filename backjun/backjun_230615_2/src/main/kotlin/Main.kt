fun main(args: Array<String>) {
    question2720()
}

fun question2720() {
    var case = readLine()!!.toInt()
    var coinArray = arrayOf(25, 10, 5, 1)

    for (i in 1 .. case ) {
        var money = readLine()!!.toInt()
        var moneyArray = mutableListOf<Int>()

        for(i in coinArray.indices) {
            moneyArray.add(money / coinArray[i])
            money %= coinArray[i]
        }

        println(moneyArray.joinToString(" "))
    }
}