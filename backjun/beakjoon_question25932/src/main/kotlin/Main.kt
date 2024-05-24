fun main(args: Array<String>) {
    question25932()
}

fun question25932() {
    val count = readln().toInt()
    for (i in 1 .. count) {
        readln().split(" ").let {
            val jack = it.contains("17")
            val mack = it.contains("18")
            println(it.joinToString(" "))
            println(if(jack && mack) {
                "both"
            } else if(jack) {
                "zack"
            } else if(mack){
                "mack"
            } else {
                "none"
            })
        }
        println()
    }
}