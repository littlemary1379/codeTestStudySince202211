import kotlin.math.pow

fun main(args: Array<String>) {
    question2745()
}

fun question2745() {
    var caseCode = arrayOf(
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z" )

    var number10 = 0.0
    var case = readLine()!!.split(" ")
    var numberArray = case[0].toCharArray()

    for(i in 1 .. numberArray.size) {
        var number = caseCode.indexOf(numberArray[i - 1].toString())
        number10 += case[1].toDouble().pow(numberArray.size - i) * number
    }

    println(number10.toInt())
}