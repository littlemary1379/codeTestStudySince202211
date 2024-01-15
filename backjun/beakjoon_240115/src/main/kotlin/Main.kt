fun main(args: Array<String>) {
    question24264()
}

fun question24264() {
//    MenOfPassion(A[], n) {
//        sum <- 0;
//        for i <- 1 to n - 1
//        for j <- i + 1 to n
//        sum <- sum + A[i] × A[j]; # 코드1
//        return sum;
//    }

    // 이 함수를 실제로 돌려보면 2부터 시작해서 돌면서 값을 모두 더하는 과정이다.
    // 7을 가정해보면 2 3 4 5 6 7 ... 3 4 5 6 7 ... 4 5 6 7 ....
    // 이렇게 진행되는데, 잘 보면 각 실행횟수가 6 .. 5 .. 4 .. 이렇게 진행됨을 관찰할 수 있다.
    // 즉, 입력받은 count에서 1을 빼고 그 값을 모두 더하면 실행횟수가 나온다.
    // 그리고, 해당 식을 보면 반복문 내의 반복문이 진행됨을 확인할 수 있다.
    // 이를 빅오로 표기하면 O(n^2 .... ) 이렇게 나올 것이다.
    // 즉, 이의 최고차항은 2이다.

    val count = readln().toLong()

    println((1..<count).sum())
    println(2)

}

fun menOFPessionTest() {
//    MenOfPassion(A[], n) {
//        sum <- 0;
//        for i <- 1 to n - 1
//        for j <- i + 1 to n
//        sum <- sum + A[i] × A[j]; # 코드1
//        return sum;
//    }


    var sum = 0
    var runnuing = 0
    val count = readln().toInt()

    var array = Array<Int>(count + 1) { i -> i + 1 }

    for (i in 1 .. count - 1) {

        println("i = $i")
        val plusI = i + 1
        println("plusI = $plusI")

        for (j in plusI .. count) {
            println("j = $j")
            runnuing += 1
            sum = array[i] + array[j]
        }
    }

    println("---------------")

    println((1 .. count - 1).sum())

    println(runnuing)
    println(sum)
}