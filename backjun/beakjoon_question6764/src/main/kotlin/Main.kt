fun main(args: Array<String>) {
    question6764()
}

fun question6764() {
    val dataArray = Array(4) { 0 }
    for(i in 1 .. 4) {
        dataArray[i - 1] = readln().toInt()
    }

    if(dataArray.count { it == dataArray[0] } == 4) {
        println("Fish At Constant Depth")
    } else if(dataArray.contentEquals(dataArray.distinct().toTypedArray())) {
        if(dataArray.contentEquals(dataArray.sortedArray())) {
            println("Fish Rising")
        } else if(dataArray.contentEquals(dataArray.sortedArrayDescending())) {
            println("Fish Diving")
        } else {
            println("No Fish")
        }
    } else {
        println("No Fish")
    }
}