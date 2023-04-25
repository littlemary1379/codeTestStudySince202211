import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question5597()
}

fun question5597() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var list = IntArray(30) { it + 1 }

    for(i in 1 .. 28) {
        var number = reader.readLine().toInt()

        list[number - 1] = 0
    }

    writer.write((list.filter { it != 0 }).joinToString("\n"))
    writer.flush()
}