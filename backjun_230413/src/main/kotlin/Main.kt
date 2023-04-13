import java.util.Scanner

fun main(args: Array<String>) {
    question8393()
}

fun question8393() {
    var sc = Scanner(System.`in`)
    var number = sc.nextInt()
    var answer = 0

    for (i in 1 .. number) {
        answer += i
    }

    println(answer)
}