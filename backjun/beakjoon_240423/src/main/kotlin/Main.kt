fun main(args: Array<String>) {
    question2309()
}

fun question2309() {
    val array = Array(9) { 0 }

    for (i in 1 .. 9) {
        val person = readln().toInt()
        array[i - 1] = person
    }

    bigLoop@ for(i in 0 ..< array.count()) {
        for(j in 0 ..< array.count()) {
            if(i != j) {
                val copyList = array.copyOf()
                copyList[i] = 0
                copyList[j] = 0
                if(copyList.sum() == 100) {
                    println(
                        copyList.sorted().toList()
                            .mapNotNull { if(it == 0) null else it }
                            .joinToString("\n")
                    )
                    break@bigLoop
                }
            }
        }
    }

}