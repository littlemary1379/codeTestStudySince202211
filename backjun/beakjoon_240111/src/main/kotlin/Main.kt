fun main(args: Array<String>) {
    question24263()
}

fun question24263() {

//    MenOfPassion(A[], n) {
//        sum <- 0;
//        for i <- 1 to n
//        sum <- sum + A[i]; # 코드1
//        return sum;
//    }

    // 해당 알고리즘은 반복문을 한번 돈다.
    // 따라서, 1을 넣으면 1번, 5를 넣으면 5번, 10을 넣으면 10번을 돈다.
    // 즉, n번 돈다고 할 수 있다. 그렇기에 해당 알고리즘을 빅오표기법으로 표기하면 O(n)으로 표시할 수 있다.
    // 결과적으로, 해답은 첫 줄에 입력받은 값, 두번째 줄은 빅오의 최고차항인 1을 출력한다.

    var count = readln().toInt()

    println(count)
    println("1")

}