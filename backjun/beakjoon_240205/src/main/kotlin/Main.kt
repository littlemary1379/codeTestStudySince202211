fun main(args: Array<String>) {
    question1018()
}

fun question1018() {
    val chessTile : MutableList<String> = mutableListOf()
    val tileNumber = readln().split(" ").map { it.toInt() }

    var minChange : Int? = null

    for(i in 0..< tileNumber[0]) {
        val tileWidth = readln()
        chessTile.add(tileWidth)
    }

    for (a in 0 .. 1) {

        //케이스를 두 개로 나눈다.
        // 0 -> W가 시작일 때, 1 -> B가 시작일때
        var evenWord : Char
        var oddWord : Char

        if(a == 0) {
            evenWord = 'W'
            oddWord = 'B'
        } else {
            evenWord = 'B'
            oddWord = 'W'
        }

        for (i in 0..tileNumber[0] - 8) {
            for (j in 0..tileNumber[1] - 8) {

                var charChange = 0

                for (k in i..<i + 8) {
                    var eachTile = chessTile[k].substring(j, j + 8)
                    var line = k - i

                    var evenResult = eachTile.filterIndexed { index, c ->
                        if(line % 2 == 0) {
                            index % 2 == 0 && c == evenWord
                        } else {
                            index % 2 == 0 && c == oddWord
                        }
                    }.length

                    var oddResult = eachTile.filterIndexed { index, c ->
                        if(line % 2 == 0) {
                            index % 2 == 1 && c == oddWord
                        } else {
                            index % 2 == 1 && c == evenWord
                        }
                    }.length

                    charChange += evenResult
                    charChange += oddResult
                }

                if(minChange == null) {
                    minChange = charChange
                } else {
                    if(charChange < minChange) {
                        minChange = charChange
                    }
                }
            }
        }
    }

    println(minChange)
}