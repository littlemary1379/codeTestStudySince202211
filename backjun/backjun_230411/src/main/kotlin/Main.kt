import java.util.Scanner

fun main(args: Array<String>) {
    question2739()
}

fun question2739() {
    var sc = Scanner(System.`in`)
    var number = sc.nextInt()

    for(i in 1 .. 9) {
        println("$number * $i = ${number * i}")
    }
}