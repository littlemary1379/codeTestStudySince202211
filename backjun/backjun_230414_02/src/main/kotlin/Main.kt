import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question15552()
}

fun question15552() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))
    var case = reader.readLine().toInt()

    while (case > 0) {
        var numbers = reader.readLine().split(" ").map { it.toInt() }
        writer.write("${numbers[0] + numbers[1]}")
        writer.newLine()

        case -= 1
    }

    writer.flush()

}