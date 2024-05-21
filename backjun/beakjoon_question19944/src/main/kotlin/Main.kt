fun main(args: Array<String>) {
    question19944()
}

fun question19944() {
    val grade = readln().split(" ").map { it.toInt() }

    if(grade[1] in 1 .. 2) {
        println("NEWBIE!")
    } else if(grade[1] in 3 .. grade[0]) {
        println("OLDBIE!")
    } else {
        println("TLE!")
    }
}