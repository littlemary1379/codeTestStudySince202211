import kotlin.math.max

fun main(args: Array<String>) {
    question2435()
}

fun question2435() {
    val time = readln().trim().split(" ").map {
        it.toInt()
    }

    val tempList = readln().split(" ").mapNotNull {
        if(it == "") {
            null
        } else {
            it.toInt()
        }
    }

    var maxTemp = 0
    for (i in 0 .. (time[0] - time[1]) ) {
        val addTemp = tempList.subList(i, i + time[1]).sum()

        maxTemp = if(i == 0) {
            addTemp
        } else {
            max(maxTemp, addTemp)
        }
    }

    println(maxTemp)
}