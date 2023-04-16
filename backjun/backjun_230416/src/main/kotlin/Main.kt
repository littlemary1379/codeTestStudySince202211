import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question11021()
}

fun question11021() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var case = reader.readLine().toInt()

    for (i in 1 .. case) {
        var numbers = reader.readLine().split(" ").map { it.toInt() }
        writer.write("Case #${i}: ${numbers.sum()}")
        writer.newLine()
    }

    writer.flush()
}