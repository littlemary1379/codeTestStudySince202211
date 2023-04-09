import java.util.Scanner

fun main(args: Array<String>) {
    question2525()
}

fun question2525() {
    var sc = Scanner(System.`in`)
    var time = sc.nextLine().split(" ").map { it.toInt() }.toMutableList()
    var period = sc.nextInt()

    time[1] += period

    time[0] = ((time[0] + time[1] / 60)) % 24
    time[1] = time[1] % 60

    println("${time[0]} ${time[1]}")
}