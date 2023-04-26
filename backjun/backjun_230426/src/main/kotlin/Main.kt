import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10811()
}

fun question10811() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var type = reader.readLine().split(" ").map { it.toInt() }
    var busket = IntArray(type[0]) { it + 1 }

    for (i in 1 .. type[1]) {
        var range = reader.readLine().split(" ").map { it.toInt() - 1 }
        busket.reverse(range[0], range[0] + (range[1] - range[0] + 1))
    }

    writer.write(busket.joinToString(" "))
    writer.flush()


}