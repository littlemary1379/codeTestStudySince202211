import java.math.BigInteger

fun main(args: Array<String>) {
    question1247()
}

fun question1247() {
    for(i in 1 .. 3) {
        val count = readln().toInt()
        var add = BigInteger("0")
        for(i in 1 .. count) {
            val number = BigInteger(readln())
            add = add.add(number)
        }

        val zero = BigInteger("0")
        if(add > zero) {
            println("+")
        } else if(add < zero) {
            println("-")
        } else {
            println("0")
        }
    }
}