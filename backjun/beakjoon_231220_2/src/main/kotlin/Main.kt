fun main(args: Array<String>) {
    question11653()
}

fun question11653() {
    var number = readln().toInt()

    if(number == 1) {
        return
    }

    var factor = 2
    var factorList : MutableList<Int> = mutableListOf()

    while (factor <= number) {
        if(number % factor == 0) {
            factorList.add(factor)
            number /= factor

            factor = 2
        } else {
            factor += 1
        }
    }

    factorList.forEach {
        println(it)
    }
}