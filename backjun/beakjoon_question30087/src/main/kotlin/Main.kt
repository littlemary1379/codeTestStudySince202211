fun main(args: Array<String>) {
    question30087()
}

fun question30087() {
    val case = readln().toInt()
    for (i in 1 .. case) {
        println(when(readln()) {
            "Algorithm" -> "204"
            "DataAnalysis" -> "207"
            "ArtificialIntelligence" -> "302"
            "CyberSecurity" -> "B101"
            "Network" -> "303"
            "Startup" -> "501"
            "TestStrategy" -> "105"
            else -> ""
        })
    }
}