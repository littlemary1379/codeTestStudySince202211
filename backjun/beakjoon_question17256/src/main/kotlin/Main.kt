fun main(args: Array<String>) {
    question17256()
}

fun question17256() {
    val cakeA = readln().split(" ").map { it.toInt() }
    val cakeC = readln().split(" ").map { it.toInt() }

    // b.x = c.a - a.z
    // b.y = c.b / a.b
    // b.z = c.z - a.x
    println("${cakeC[0] - cakeA[2]} ${cakeC[1] / cakeA[1]} ${cakeC[2] - cakeA[0]}")

}