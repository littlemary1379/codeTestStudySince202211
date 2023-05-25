import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question11654()
}

fun question11654() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var alphabet = reader.readLine().toString().toCharArray()

    writer.write("${alphabet[0].code}")
    writer.flush()

}