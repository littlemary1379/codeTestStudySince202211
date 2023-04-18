import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10951()
}

fun question10951() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var numbersString = reader.readLine()
        if (numbersString.isNullOrEmpty()) {
            break
        }

        var numbers = numbersString.split(" ").map { it.toInt() }

        writer.write("${numbers.sum()}")
        writer.newLine()
    }

    writer.flush()
}