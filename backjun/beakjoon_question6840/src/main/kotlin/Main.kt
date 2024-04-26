fun main(args: Array<String>) {
    question6840()
}

// Who is in the middle?
fun question6840() {
    var array = Array(3) { 0 }

    for(i in 1 .. array.size) {
        val weight = readln().toInt()
        array[i - 1] = weight
    }

    println(array.sortedArray()[1])
}