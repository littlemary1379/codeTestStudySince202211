import java.lang.StringBuilder
import java.util.Collections

fun main(args: Array<String>) {

    var X = "5525"
    var Y = "1255"

    var xSplit = X.split("")
    var ySplit = Y.split("")

    var arrayList = ArrayList<String>()
    var answer = ""

    for(i in 1 until xSplit.size-1 ) {
        if(xSplit[i] == "") {
            return
        }

        var xChar = xSplit[i]

            for(j in 1 until ySplit.size-1 ) {
                if(ySplit[j] == "") {
                    return
                }

                var yChar = ySplit[j]

                if(xChar.equals(yChar)) {
                    arrayList.add(xChar)
                    break
                }

            }
    }

    println(arrayList)

    if(arrayList.size < 1) {
        println("not equal")
        answer = "-1"
    } else {
        Collections.sort(arrayList, Collections.reverseOrder());
        println(arrayList)

        var answerStringBuilder = StringBuilder()

        for(i in 0 until arrayList.size) {
            answerStringBuilder.append(arrayList[i])
        }

        answer = answerStringBuilder.toString()
    }

    println("answer : $answer")


}