fun main(args: Array<String>) {
    question31821()
}

fun question31821() {
    val menuList = mutableListOf<Int>()
    val menuCount = readln().toInt()
    for(i in 1 .. menuCount) {
        menuList.add(i - 1, readln().toInt())
    }

    val student = readln().toInt()
    var money = 0
    for(i in 1 .. student) {
        money += menuList[readln().toInt() - 1]
    }

    println(money)
}