import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10871()
}

fun question10871() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var numbers = reader.readLine().split(" ").map { it.toInt() }
    var list = reader.readLine().split(" ").map { it.toInt() }

    var listFilter = list.filter { it < numbers[1] }
    writer.write(listFilter.joinToString(" "))
    writer.flush()
}