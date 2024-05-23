fun main(args: Array<String>) {
    question25494()
}

fun question25494() {
    val case = readln().toInt()
    for(i in 1 .. case) {
        val numbers = readln().split(" ").map { it.toInt() }
        var count = 0
        for(j in 1 .. numbers[0]) {
            for (k in 1 .. numbers[1]) {
                for (l in 1 .. numbers[2]) {
                    if(j % k == k % l
                        && k % l == l % j
                        && j % k == l % j) {
                        count += 1
                    }
                }
            }
        }

        println(count)
    }
}