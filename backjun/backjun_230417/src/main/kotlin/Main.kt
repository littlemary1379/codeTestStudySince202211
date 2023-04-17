import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question11022()
}

fun question11022() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var case = reader.readLine().toInt()

    for (i in 1 .. case) {
        var numbers = reader.readLine().split(" ").map { it.toInt() }
        writer.write("Case #${i}: ${numbers[0]} + ${numbers[1]} = ${numbers.sum()}")
        writer.newLine()
    }

    writer.flush()
}