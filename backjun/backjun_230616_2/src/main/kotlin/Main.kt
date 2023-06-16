fun main(args: Array<String>) {
    question2292()
}

fun question2292() {
    var room = readLine()!!.toInt()

    var count = 0
    var allRoomCount = 1

    while (true) {
        allRoomCount += count * 6
        if(room <= allRoomCount) {
            break
        }
        count += 1
    }

    println(count + 1)
}