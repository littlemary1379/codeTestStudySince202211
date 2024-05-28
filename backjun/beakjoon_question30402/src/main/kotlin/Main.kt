fun main(args: Array<String>) {
    question30402()
}

fun question30402() {
    val list = mutableListOf<String>()
    for(i in 1 .. 15) {
        list.addAll(readln().split(" "))
    }
    println(if(list.contains("w")) {
        "chunbae"
    } else if(list.contains("b")) {
        "nabi"
    } else if(list.contains("g")) {
        "yeongcheol"
    } else {
        ""
    })
}