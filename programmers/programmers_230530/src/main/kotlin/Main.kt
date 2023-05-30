fun main(args: Array<String>) {
    val s1 = readLine()!!
    var newString = ""
    s1.toCharArray().forEach {
        newString += if(it.isLowerCase()) {
            it.uppercaseChar()
        } else {
            it.lowercaseChar()
        }
    }

    println(newString)
}