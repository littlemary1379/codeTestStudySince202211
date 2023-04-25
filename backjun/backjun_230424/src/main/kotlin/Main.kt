import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    question10813()
    
}

fun question10813() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var writer = BufferedWriter(OutputStreamWriter(System.out))

    var basketCase = reader.readLine().split(" ").map { it.toInt() }
    var baskets = IntArray(basketCase[0]){ it + 1 }

    for (i in 0 until basketCase[1]) {
        var numbers = reader.readLine().split(" ").map { it.toInt() - 1 }

        var firstBasket = baskets[numbers[0]]
        var secondBasket = baskets[numbers[1]]

        baskets[numbers[0]] = secondBasket
        baskets[numbers[1]] = firstBasket

    }

    writer.write(baskets.joinToString(" "))
    writer.flush()

}