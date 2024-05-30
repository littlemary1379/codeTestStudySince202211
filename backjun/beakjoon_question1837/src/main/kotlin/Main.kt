import java.lang.Exception
import java.math.BigInteger
import kotlin.math.floor
import kotlin.math.min
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question1837()
}

fun question1837() {
    val privateList = eratos()
    val password = readln().split(" ")

    for(i in privateList.indices) {
        if(privateList[i] >= password[1].toInt()) {
            break
        } else {
            if(BigInteger(password[0]).mod(BigInteger(privateList[i].toString())).toInt() == 0) {
                println("BAD ${privateList[i]}")
                return
            }
        }
    }

    println("GOOD")


}


fun eratos() : List<Int> {
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

    val list = mutableListOf<Int>()
    for(i in 1 ..< eratosArray.size) {
        if(eratosArray[i]) {
            list.add(i)
        }
    }

    return list
}