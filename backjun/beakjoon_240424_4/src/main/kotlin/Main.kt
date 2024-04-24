import kotlin.math.abs

fun main(args: Array<String>) {
    question10819()
}

fun question10819() {
    val count = readln().trim().toInt()
    val numbers = readln().trim().split(" ").map { it.toInt() }
    val sortNumber = numbers.sorted().toMutableList()

    val newArray = mutableListOf<Int> ()

    for(i in 0 ..< count) {
        if(i == 0) {

            val index: Int = if(count % 2 == 0) {
                val exampleIndex = (sortNumber.count()) / 2
                if(abs(sortNumber[exampleIndex] - sortNumber.last()) < abs(sortNumber[exampleIndex - 1] - sortNumber.first())) {
                    exampleIndex
                } else {
                    exampleIndex - 1
                }
            } else {
                (sortNumber.count() - 1) / 2
            }

            newArray.add(i, sortNumber[index])
            sortNumber.removeAt(index)
        } else {
            var abs = 0
            var finalIndex = 0
            for(j in 0 ..< sortNumber.size) {
                val measureAbs = abs(newArray[i - 1] - sortNumber[j])
                if(measureAbs >= abs) {
                    abs = measureAbs
                    finalIndex = j
                }
            }

            newArray.add(i, sortNumber[finalIndex])
            sortNumber.removeAt(finalIndex)

        }
    }

    var addAll = 0
    for(i in 0 ..< count - 1) {
        addAll += abs(newArray[i] - newArray[i + 1])
    }

    println(addAll)

}