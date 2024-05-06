fun main(args: Array<String>) {
    question6763()
}

fun question6763() {
    val limit = readln().toInt()
    val speed = readln().toInt()

    val diff = speed - limit
    println(if(diff <= 0) {
        "Congratulations, you are within the speed limit!"
    } else if(diff in 1 .. 20) {
        "You are speeding and your fine is \$100."
    } else if(diff in 21 .. 30) {
        "You are speeding and your fine is \$270."
    } else {
        "You are speeding and your fine is \$500."
    })
}