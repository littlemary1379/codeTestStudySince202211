import java.util.Scanner

fun main(args: Array<String>) {
    question25314()
}

fun question25314() {
    var sc = Scanner(System.`in`)
    var byte = sc.nextInt()

    println("${"long ".repeat(byte/4)}int")
}