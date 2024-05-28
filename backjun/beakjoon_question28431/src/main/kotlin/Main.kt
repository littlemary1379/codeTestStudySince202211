fun main(args: Array<String>) {
    question28431()
}

fun question28431() {
    val list = mutableListOf<String>()
    for(i in 1 .. 5) {
        list.add(readln())
    }

    for(i in list) {
        if(list.count { it == i } % 2 == 1) {
            println(i)
            break
        }
    }
}