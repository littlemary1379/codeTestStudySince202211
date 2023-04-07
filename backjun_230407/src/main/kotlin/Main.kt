import java.util.Scanner

fun main(args: Array<String>) {
    question14681()
}

fun question14681() {
    var sc = Scanner(System.`in`)
    var x = sc.nextInt()
    var y = sc.nextInt()

    if(x > 0) {
        if(y > 0) {
            println(1)
        } else {
            println(4)
        }
    } else {
        if(y > 0) {
            println(2)
        } else {
            println(3)
        }
    }
}