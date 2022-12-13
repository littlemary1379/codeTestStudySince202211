import java.lang.StringBuilder

fun main(args: Array<String>) {
    //var numbers = "01087895675"
    //var numbers = "027778888"
    var numbers = "010123456789"
    var answerStringBuilder : StringBuilder = StringBuilder()
    var numbersArray = numbers.split("")

    if(numbersArray.size <= 5) {
        return
    }

    for(i in numbersArray.indices) {
        if(numbersArray[i] == "") {
            continue
        }
        println("split numbers ${numbersArray[i]}")
        if(i > numbersArray.size - 6) {
            answerStringBuilder.append(numbersArray[i])
        } else {
            answerStringBuilder.append("*")
        }
    }

    var answer = answerStringBuilder.toString()
    println("answer ? ${answer}")
}