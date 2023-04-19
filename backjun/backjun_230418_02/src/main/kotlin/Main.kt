import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10807()
}

fun question10807() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    reader.readLine()
    var list = reader.readLine().split(" ")
    var number = reader.readLine()

    writer.write("${list.count { it == number }}")
    writer.flush()
}