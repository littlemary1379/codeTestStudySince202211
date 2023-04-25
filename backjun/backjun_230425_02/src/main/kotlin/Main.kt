import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question3052()
}

fun question3052() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var hashSet = HashSet<Int>()

    for(i in 1 .. 10) {
        var number = reader.readLine().toInt()
        hashSet.add(number % 42)
    }

    writer.write("${hashSet.size}")
    writer.flush()
}