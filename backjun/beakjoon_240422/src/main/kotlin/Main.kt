import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.ceil
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    question17427()
}

fun question17427() {

    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    val number = bufferedReader.readLine().toInt()
    var sum = 0L
    for(i in 1 .. number) {
        sum += (number / i) * i
    }

    println(sum)

}
