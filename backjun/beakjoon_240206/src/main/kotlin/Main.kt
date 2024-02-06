fun main(args: Array<String>) {
    question1436()
}

fun question1436() {
    val goalCount = readln().toInt()

    var whileCount = 0
    var count666 = 0

    while(true) {

        if(whileCount.toString().contains("666")) {
            count666 += 1

            if(count666 == goalCount) {
                println(whileCount)
                break
            }

        }

        whileCount += 1
    }

}