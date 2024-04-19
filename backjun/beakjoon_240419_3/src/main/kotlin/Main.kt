import kotlin.math.sqrt

fun main(args: Array<String>) {
    question6588()
}

fun question6588() {
    val eratos = eratosPrime(1000000)

    whileLoop@ while (true) {
        val read = readln().toInt()
        if(read == 0) {
            break
        }

        forLoop@ for(i in 2 .. (read / 2)) {
            if(eratos[i] && eratos[read - i]) {
                println("$read = $i + ${read-i}")
                continue@whileLoop
            }
        }

        println("Goldbach's conjecture is wrong.")

    }

}

// true : 소수, false : 합성수, 0, 1
fun eratosPrime(size : Int) : Array<Boolean> {

    val array = Array(size + 1) { true }.apply {
        this[0] = false
        this[1] = false
    }

    for(i in 2 .. sqrt(size.toDouble()).toInt()) {
        if(array[i]) {
            for(j in i * i .. size step i) {
                array[j] = false
            }
        }
    }

    return array

}