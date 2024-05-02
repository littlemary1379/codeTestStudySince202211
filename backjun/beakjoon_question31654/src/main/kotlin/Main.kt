fun main(args: Array<String>) {
    question31654()
}

fun question31654() {
    val numbers = readln().split(" ").map { it.toInt() }
    println(if(numbers[0] + numbers[1] == numbers[2]) "correct!" else "wrong!")
}