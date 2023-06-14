fun main(args: Array<String>) {
    question2566()
}

fun question2566() {

    var maxList = mutableListOf<Int>()
    var indexList = mutableListOf<Int>()

    for(i in 0 .. 8) {
        var items = readLine()!!.split(" ").map { it.toInt() }
        var max = items.max()
        maxList.add(i, max)
        indexList.add(i, items.indexOf(max))

    }

    var max = maxList.max()
    var index = maxList.indexOf(max)
    println(max)
    println("${index + 1} ${indexList[index] + 1}")

}