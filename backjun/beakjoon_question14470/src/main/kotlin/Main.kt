fun main(args: Array<String>) {
    question14470()
}

fun question14470() {
    var lowerTemp = readln().toInt()
    val upperTemp = readln().toInt()
    val iceup = readln().toInt()
    val iceing = readln().toInt()
    val waterup = readln().toInt()

    var time = 0

    if(lowerTemp <= 0) {
        time += -(lowerTemp * iceup)
        time += iceing
        lowerTemp = 0
    }

    time += (upperTemp - lowerTemp) * waterup

    println(time)

}