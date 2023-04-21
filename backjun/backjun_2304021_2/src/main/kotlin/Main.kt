import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10810()
}

fun question10810() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var case = reader.readLine().split(" ").map { it.toInt() }

    var list = IntArray(case[0]) { 0 }

    for(i in 1 .. case[1]) {
        var balls = reader.readLine().split(" ").map { it.toInt() }

        for(i in balls[0] .. balls[1]) {
            list[i - 1] = balls[2]
        }

    }

    writer.write(list.joinToString(" "))
    writer.flush()

}