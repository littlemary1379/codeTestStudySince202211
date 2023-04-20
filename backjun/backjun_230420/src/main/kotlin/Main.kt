import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10818()
}

fun question10818() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    reader.readLine()
    var list = reader.readLine().split(" ").map { it.toInt() }
    writer.write("${list.min()} ${list.max()}")
    writer.flush()
}