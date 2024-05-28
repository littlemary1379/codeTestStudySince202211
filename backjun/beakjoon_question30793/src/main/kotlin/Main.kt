fun main(args: Array<String>) {
    question30793()
}

fun question30793() {
    readln().split(" ").map { it.toDouble() }.let {
        val percentage = it[0] / it[1]
        println(if(percentage > 0 && percentage < 0.2) {
            "weak"
        } else if(percentage >= 0.2 && percentage < 0.4) {
            "normal"
        } else if(percentage >= 0.4 && percentage < 0.6) {
            "strong"
        } else if(percentage >= 0.6) {
            "very strong"
        } else {
            ""
        })
    }
}