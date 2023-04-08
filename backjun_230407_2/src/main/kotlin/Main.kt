import java.util.Scanner

fun main(args: Array<String>) {
    question2884()
}

fun question2884() {
    var sc = Scanner(System.`in`)
    sc.nextLine().split(" ").let {
        var hour = it[0].toInt()
        var minute = it[1].toInt() - 45

        if(minute < 0) {
            minute += 60
            hour -= 1
            if(hour < 0) {
                hour = 23
            }
        }

        println("$hour $minute")
    }

}