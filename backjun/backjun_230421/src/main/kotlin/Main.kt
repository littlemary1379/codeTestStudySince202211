import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question2562()
}

fun question2562() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var list = IntArray(9)

    for(i in list.indices) {
        list[i] = reader.readLine().toInt()
    }

    writer.write("${list.max()}\n")
    writer.write("${(list.indexOf(list.max())) + 1}")
    writer.flush()

}