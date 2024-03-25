fun main(args: Array<String>) {
    question1934()
}

fun question1934() {
    val count = readln().toInt()
    for(i in 1 .. count) {
        val numberList = readln().split(" ").map { it.toInt() }
        println(leastMultiple(numberList[0], numberList[1]))
    }
}

fun leastMultiple(a : Int, b : Int) : Int {
    val divisorList = mutableListOf<Int>()
    var calA = a
    var calB = b

    var count = 2
    while (true) {
        // 숫자가 넘어가는 경우 해당 로직을 종료함
        if(calA / count == 0 && calB / count == 0) {
            break
        } else {
            if(calA % count == 0 && calB % count == 0) {
                divisorList.add(count)
                calA /= count
                calB /= count

                count = 2

            } else {
                count++
            }
        }
    }

    var multiple = 1
    divisorList.forEach {
        multiple *= it
    }

    return multiple * calA * calB

}