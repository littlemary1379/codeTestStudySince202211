fun main(args: Array<String>) {
    question24267()
}

fun question24267() {
    val n = readln().toLong()

    var test = n * (n - 1) * (n - 2) / 6

    println(test)
    println(3)

    //testPassion(n)

}

fun testPassion(n : Int) {
//    sum <- 0;
//    for i <- 1 to n - 2
//    for j <- i + 1 to n - 1
//    for k <- j + 1 to n
//    sum <- sum + A[i] × A[j] × A[k]; # 코드1
//    return sum;

    //val n = readln().toInt()
    var running = 0

    for (i in 1 .. n - 2) {
        println("i : $i")
        for (j in i + 1 .. n - 1) {
            println("j : $j")
            var allk = 0
            for (k in j + 1 .. n ) {
                println("k : $k")
                running += 1
                allk += 1
            }

            println("allk : $allk")
        }
    }

    println(running)
//    println("...............")

//    var runningCount = 0
//    for(i in n - 1 downTo 1) {
////        var allAdd = (i) * (i - 1) / 2
////        println("allAdd : $allAdd")
//        runningCount += (i) * (i - 1) / 2
//    }
//
//    println(runningCount)
}