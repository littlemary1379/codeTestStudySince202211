fun main(args: Array<String>) {
    question2783()
}

fun question2783() {
    var arrayType = readLine()!!.split(" ").map { it.toInt() }

    var firstArray = mutableListOf<MutableList<Int>>()
    var secondArray = mutableListOf<MutableList<Int>>()

    for(i in 1 .. (arrayType[0] * 2)) {
        var item = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
        if(i <= arrayType[0]) { firstArray.add(item) } else { secondArray.add(item) }
    }

    for(i in 0 until firstArray.size) {
        for(j in 0 until firstArray[i].size) {
            firstArray[i][j] += secondArray[i][j]

        }
        println(firstArray[i].joinToString(" "))
    }

}