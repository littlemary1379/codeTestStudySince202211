import kotlin.math.max

fun main(args: Array<String>) {
    question1157()
}

fun question1157() {

    var maxCount = 0
    var maxChar = ""

    var word = readLine()!!.uppercase().toCharArray()
    var wordDistinct = word.distinct()

    wordDistinct.forEach {
        var count = word.count { wordChar -> wordChar == it }

        if(maxCount == count) {
            maxChar = "?"
        } else if(maxCount < count) {
            maxCount = count
            maxChar = it.toString()
        }
    }

    println(maxChar)
}