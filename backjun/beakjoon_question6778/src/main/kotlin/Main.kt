fun main(args: Array<String>) {
    question6778()
}

fun question6778() {
    val antenna = readln().toInt()
    val eyes = readln().toInt()

    if(antenna >= 3 && eyes <= 4) {
        println("TroyMartian")
    }

    if(antenna <= 6 && eyes >= 2) {
        println("VladSaturnian")
    }

    if(antenna <= 2 && eyes <= 3) {
        println("GraemeMercurian")
    }
}