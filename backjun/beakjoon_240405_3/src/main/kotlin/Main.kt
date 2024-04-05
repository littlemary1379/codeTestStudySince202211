import kotlin.math.max

fun main(args: Array<String>) {
    question12865()
}

fun question12865() {
    // 물건수 + 최대 무게
    val condition = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<Item>()

    for (i in 1 .. condition[0]) {
        val rawItem = readln().split(" ").map { it.toInt() }
        list.add(Item(rawItem[0], rawItem[1]))
    }

    // compareList[물건][무게]
    val compareList = arrayListOf<Array<Int>>()
    for(i in 0 .. condition[0]) {
        compareList.add(Array(condition[1] + 1){0})
    }

    var maxPrice = 0

    // 무게
    for(i in 1 .. condition[1]) {
        // 물건 넣어봄
        for(j in 1 .. condition[0]) {
            if(list[j - 1].weight > i) {
                compareList[j][i] = compareList[j-1][i]
            } else {
                compareList[j][i] = max(compareList[j-1][i-list[j-1].weight] + list[j-1].price, compareList[j-1][i])
                maxPrice = max(maxPrice, compareList[j][i])
            }
        }
    }

    println(maxPrice)

}



data class Item(
    val weight : Int,
    val price : Int
)