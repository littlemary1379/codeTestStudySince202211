import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.nio.Buffer

fun main(args: Array<String>) {
    question10952()
}

fun question10952() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var numbers = reader.readLine().split(" ").map { it.toInt() }
        if(numbers.count { it == 0 } == numbers.size) {
            break
        }

        writer.write("${numbers.sum()}")
        writer.newLine()

    }

    writer.flush()
}