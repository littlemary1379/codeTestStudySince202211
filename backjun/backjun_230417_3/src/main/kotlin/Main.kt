import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question2439()
}

fun question2439() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var count = reader.readLine().toInt()

    for(i in 1..count) {
        writer.write(" ".repeat(count-i))
        writer.write("*".repeat(i))
        writer.newLine()
    }

    writer.flush()
}