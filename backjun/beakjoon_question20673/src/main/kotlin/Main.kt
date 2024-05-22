fun main(args: Array<String>) {
    question20673()
}

fun question20673() {

    val confirm = readln().toInt()
    val admission = readln().toInt()

    if(confirm <= 50 && admission <= 10) {
        println("White")
    } else if(admission > 30) {
        println("Red")
    } else {
        println("Yellow")
    }
}