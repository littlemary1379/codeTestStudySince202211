fun main(args: Array<String>) {
    question14489()
}

fun question14489() {
    val money = readln().split(" ").map { it.toLong() }
    val chicken = readln().toLong()

    if(money[0] + money[1] >= chicken * 2) {
        println((money[0] + money[1]) - (chicken * 2))
    } else {
        println(money[0] + money[1])
    }

}