import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question27866()
}

fun question27866() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var readerString = reader.readLine()
    writer.write(readerString[reader.readLine().toInt() - 1].toString())
    writer.flush()
}