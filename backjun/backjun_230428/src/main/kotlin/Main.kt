import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question2743()
}

fun question2743() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    writer.write("${reader.readLine().length}")
    writer.flush()
}