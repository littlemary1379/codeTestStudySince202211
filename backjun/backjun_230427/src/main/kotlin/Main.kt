import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question1546()
}

fun question1546() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))
    var addGrades = 0.0

    var number = reader.readLine().toInt()
    var grades = reader.readLine().split(" ").map { it.toDouble() }
    var max = grades.max()

    grades.forEach {
        addGrades += it / max * 100.0
    }

    writer.write("${addGrades / number}")
    writer.flush()
}