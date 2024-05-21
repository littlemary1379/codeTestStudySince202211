fun main(args: Array<String>) {
    question18698()
}

fun question18698() {
    val case = readln().toInt()
    for (i in 1 .. case) {
        val baby = readln()
        val babyIndex = baby.indexOfFirst { it == 'D' }

        if(babyIndex == -1) {
            println(baby.length)
        } else{
            println(baby.substring(0, babyIndex).length)
        }

    }
}