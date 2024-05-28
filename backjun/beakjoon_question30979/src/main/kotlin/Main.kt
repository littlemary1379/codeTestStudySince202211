fun main(args: Array<String>) {
    question30979()
}

fun question30979() {
    val mustTime = readln().toInt()
    val candyCount = readln().toInt()
    readln().split(" ").map { it.toInt() }.let {
        println(if(it.sum() >= mustTime) {
            "Padaeng_i Happy"
        } else {
            "Padaeng_i Cry"
        })
    }
}