import java.util.Scanner

fun main(args: Array<String>) {
    question2753()
}

fun question2753() {
    var sc = Scanner(System.`in`)
    var year = sc.nextInt()

    // (4의 배수면서 && 100의 배수가 아닐때) || 400의 배수일때)
    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        println(1)
    } else {
        println(0)
    }
}