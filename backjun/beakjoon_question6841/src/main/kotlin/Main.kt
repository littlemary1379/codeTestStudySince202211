fun main(args: Array<String>) {
    question6841()
}

fun question6841() {
    while (true) {
        val sentense = readlnOrNull()
        if(sentense.isNullOrEmpty()) {
            break
        } else {
            println(printImoji(sentense))
        }
    }
}

fun printImoji(write : String) : String{
    return when(write) {
        "CU" -> "see you"
        ":-)" -> "I’m happy"
        ":-(" -> "I’m unhappy"
        ";-)" -> "wink"
        ":-P" -> "stick out my tongue"
        "(~.~)" -> "sleepy"
        "TA" -> "totally awesome"
        "CCC" -> "Canadian Computing Competition"
        "CUZ" -> "because"
        "TY" -> "thank-you"
        "YW" -> "you’re welcome"
        "TTYL" -> "talk to you later"
        else -> write
    }
}