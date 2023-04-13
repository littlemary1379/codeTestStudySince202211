fun main(args: Array<String>) {
    println("Hello World!")

    var s = "A X Z a x z"
    var i = 25

    println('a'.code)
    println('z'.code)
    println('A'.code)
    println('Z'.code)
    println()


    var sArray = s.toCharArray()
    for(j in sArray.indices) {
        if((s[j].code in 65..90) || (s[j].code in 97..122)) {

            println(s[j].code + 25)

            if(((s[j].code in 65..90) && (s[j].code + i) > 90)
                || ((s[j].code in 97..122) && (s[j].code + i) > 122)) {
                sArray[j] = (s[j].code + i - 26).toChar()
            } else {
                sArray[j] = (s[j].code + i).toChar()
            }
        }
    }

    println(String(sArray))
}