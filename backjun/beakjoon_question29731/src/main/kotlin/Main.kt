fun main(args: Array<String>) {
    question29731()
}

fun question29731() {
    val promise = arrayOf(
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    )

    val count = readln().toInt()
    for(i in 1 .. count) {
        if(!promise.contains(readln())) {
            println("Yes")
            break
        } else {
            if(i == count) {
                println("No")
            }
        }
    }
}