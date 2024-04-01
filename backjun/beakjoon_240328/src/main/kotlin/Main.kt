import kotlin.math.floor
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question17103()
}

fun question17103() {

    // 최대크기만큼 체 준비
    val eratosArray = Array(1000001) { true }
    eratosArray[0] = false
    eratosArray[1] = false
    for(i in 2 .. floor(sqrt(eratosArray.size.toDouble())).toInt()) {
        if(eratosArray[i]) {
            for(j in i * i ..< eratosArray.size step i) {
                eratosArray[j] = false
            }
        }

    }

    val count = readln().toInt()
    for(i in 1 .. count) {
        var number = readln().toInt()
        var primCount = 0
        for(j in 1 .. number / 2) {
            if(eratosArray[j] && eratosArray[number - j]) {
                primCount += 1
            }
        }
        println(primCount)
    }
}