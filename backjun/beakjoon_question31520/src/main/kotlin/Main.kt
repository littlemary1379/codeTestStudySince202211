fun main(args: Array<String>) {
    question31520()
}

fun question31520() {
    val integer = readln()
    var integerTest = integer
    var count = 1
    countLoop@ while(integerTest.isNotEmpty()) {
        var countString = count.toString()
        for (i in countString.indices) {
            if(integerTest[i] != countString[i]) {
                println(-1)
                return
            }
        }
        integerTest = integerTest.substring(countString.length)
        count++
    }
    println(count - 1)
}