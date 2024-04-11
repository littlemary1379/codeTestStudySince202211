import kotlin.math.max

fun main(args: Array<String>) {
    question14501()
}

fun question14501() {
    val day = readln().toInt()

    val list = mutableListOf<Consulting>()
    for (i in 1..day) {
        val require = readln().split(" ").map { it.toInt() }
        list.add(Consulting(require[0], require[1]))
    }

    val dp = Array(day + 1) { 0 }

    for (i in 0 ..< day) {
        if(i + list[i].day <= day) {
            dp[i + list[i].day] = max(dp[i + list[i].day], dp[i] + list[i].price)
        }

        dp[i+1] = max(dp[i+1], dp[i])
    }

    println(dp[day])


}

data class Consulting(
    val day: Int,
    val price: Int
)