fun main(args: Array<String>) {
    question30468()
}

fun question30468() {
    readln().split(" ").map { it.toInt() }.let {
        val stat = it.last() * 4 - (it.sum() - it.last())
        println(if(stat > 0) stat else 0)
    }
}