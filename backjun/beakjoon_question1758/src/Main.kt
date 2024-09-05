fun main() {
    question1758()
}

fun question1758() {
    val case = readln().toInt()
    val tip = mutableListOf<Long>()
    for(i in 1 .. case) {
        tip.add(readln().toLong())
    }

    var upperCase = 0L
    tip.sortedDescending().forEachIndexed { index, i ->
        (i - index).let {
            if(it > 0) upperCase += it
        }
    }

    println("$upperCase")
}