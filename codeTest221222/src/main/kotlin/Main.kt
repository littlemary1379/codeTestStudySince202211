fun main(args: Array<String>) {
    println("Hello World!")

    var food : IntArray = intArrayOf(1, 3, 4, 6)
    var foodString : String = ""

    for (i in 1 until food.size) {
        foodString += "$i".repeat(food[i] / 2)
    }

    var answer = foodString + "0" + foodString.reversed()
    println(answer)
}