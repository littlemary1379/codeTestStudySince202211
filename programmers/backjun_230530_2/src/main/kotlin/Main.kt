import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question2675()
}

fun question2675() {
    var case = readLine()!!
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    for(i in 0 until case.toInt()) {
        var repeat = readLine()!!
        var repeatLineStringArray = repeat.split(" ")

        var repeatString = ""
        repeatLineStringArray[1].toCharArray().forEach {
            repeatString += it.toString().repeat(repeatLineStringArray[0].toInt())
        }
        writer.write("$repeatString\n")
    }

    writer.flush()
}