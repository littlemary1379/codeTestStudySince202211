import kotlin.math.abs

fun main(args: Array<String>) {
    question27918()
}

fun question27918() {
    val count = readln().toInt()
    var dal = 0
    var po = 0

    for(i in 1 .. count) {
        if(readln() == "D") {
            dal++
        } else {
            po++
        }

        if(abs(dal - po) >= 2) {
            break
        }
    }

    println("$dal:$po")
}