import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question9086()
}

fun question9086() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var case = reader.readLine().toInt()
    for (i in 1 .. case) {
        var word = reader.readLine()
        writer.write("${word[0]}${word[word.length - 1]}\n")
    }
    writer.flush()
}