fun main(args: Array<String>) {
    question4589()
}

fun question4589() {
    val count = readln().toInt()
    println("Gnomes:")
    countLoop@ for (i in 1 .. count) {
        val noum = readln().split(" ").map { it.toInt() }
        var order : Boolean? = null
        for(j in 0 .. noum.count() - 2) {
            if(order == null) {
                order = noum[j] > noum[j + 1]
            } else {
                if((order && noum[j] < noum[j + 1]) || !order && noum[j] > noum[j + 1]) {
                    println("Unordered")
                    continue@countLoop
                }
            }
        }
        println("Ordered")
    }
}