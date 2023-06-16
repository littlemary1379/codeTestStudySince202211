import kotlin.math.pow

fun main(args: Array<String>) {
    question11005()
}

fun question11005() {

    var caseCode = arrayOf(
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z" )

    var item = readLine()!!.split(" ").map { it.toInt() }
    var number10 = item[0].toDouble()
    var square = item[1].toDouble()
    var returnNumber = ""

    var count = 0
    while (true) {
        var calc = number10 / square.pow(count)
        if (calc < square) {
            returnNumber += caseCode[calc.toInt()]
            number10 %= square.pow(count)
            break
        } else {
            count += 1
        }
    }
    //이미 가장 큰 자리를 더했으므로 count -1 하고 downTo로 내려가봄.
    if(count != 0) {
        for (i in (count - 1) downTo 0) {
            returnNumber += caseCode[(number10 / square.pow(i)).toInt()]
            number10 %= square.pow(i)

        }
    }

    println(returnNumber)
}