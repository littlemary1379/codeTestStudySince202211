import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question1152()
}

fun question1152() {
    var writer = BufferedWriter(OutputStreamWriter(System.out))
    writer.write("${readLine()!!.split(" ").count { it.isNotEmpty() }}")
    writer.flush()
}