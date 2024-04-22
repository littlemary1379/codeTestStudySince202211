import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception
import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.system.measureTimeMillis


fun main(args: Array<String>) {
//    val measure = measureTimeMillis { question17425() }
//    println(measure)
    question17425()
}

fun question17425() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    val mesArray = eratosPrime(1000000)

    val count = bufferedReader.readLine().toInt()

    for(i in 1 .. count) {
        val number = bufferedReader.readLine().toInt()
        bufferedWriter.write("${mesArray[number]}")
        bufferedWriter.write("\n")
    }

    bufferedWriter.flush()
}

// true : 소수, false : 합성수, 0, 1
fun eratosPrime(size : Int) : Array<Long> {

    val mesArray = Array(size + 1) { 1L }
    val mesAddArray = Array(size + 1) { 1L }

    for(i in 2 ..< mesArray.size) {
        for(j in 1..< ceil(mesAddArray.size.toDouble() / i).toInt()) {
            mesArray[i * j] += i.toLong()
        }
    }

    for(i in 2 ..< mesAddArray.size) {
        mesAddArray[i] = mesAddArray[i - 1] + mesArray[i]
    }

    return mesAddArray

}