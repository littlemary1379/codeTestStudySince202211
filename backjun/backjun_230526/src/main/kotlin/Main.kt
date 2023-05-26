import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question11720()
}

fun question11720() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))
    var total = 0

    reader.readLine()
    var stringCharArray = reader.readLine().toCharArray()
    stringCharArray.forEach {
        total += it.toString().toInt()
    }

    writer.write("$total")
    writer.flush()
}