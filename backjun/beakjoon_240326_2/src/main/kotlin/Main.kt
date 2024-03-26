fun main(args: Array<String>) {
    question2485()
}

fun question2485() {
    val count = readln().toInt()
    val list = hashMapOf<Int, Int>()

    var previous = 0
    for(i in 1 .. count) {
        val location = readln().toInt()
        if(previous != 0) {
            val key = location - previous
            list[key] = list.getOrDefault(key, 0) + 1
        }
        previous = location
    }

    var prevDivider = 0
    list.forEach {
        prevDivider = if (prevDivider == 0) {
            it.key
        } else {
            euclideanAlgorithm(prevDivider, it.key)
        }
    }

    var treeCount = 0
    list.forEach {
        treeCount += (it.key / prevDivider - 1) * it.value
    }

    println(treeCount)

}

fun euclideanAlgorithm(a : Int, b: Int) : Int {
    var cloneA = a
    var cloneB = b

    val result : Int
    while (true) {
        val remain = cloneA % cloneB
        if(remain == 0) {
            result = cloneB
            break
        } else {
            cloneA = cloneB
            cloneB = remain
        }
    }

    return result

}