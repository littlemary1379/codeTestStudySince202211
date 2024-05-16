fun main(args: Array<String>) {
    question13623()
}

fun question13623() {
    val player = readln().split(" ").map { it.toInt() }
    val count0 = player.count{ it == 0 }
    val count1 = player.count{ it == 1 }

    if(count0 == 3 || count1 == 3) {
        println("*")
    } else {
        val index = if(count0 > count1) {
            player.indexOf(1)
        } else {
            player.indexOf(0)
        }

        println((65 + index).toChar())
    }
}