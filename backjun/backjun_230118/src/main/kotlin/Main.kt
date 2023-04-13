import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    question1004()
}

fun question1004() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var case = reader.readLine().toInt()

    for(i in 1 .. case) {

        var goalCoor = reader.readLine().toString()
        var coorCount = reader.readLine().toInt()
        var meetPlanetCount = 0
        var isOne = 0

        var goalCoorArray = goalCoor.split(" ")
        var goalStart = arrayOf(goalCoorArray[0], goalCoorArray[1])
        var goalEnd = arrayOf(goalCoorArray[2], goalCoorArray[3])

        for (j in 1..coorCount) {
            var planetCoor = reader.readLine().toString()
            var planetCoorArray = planetCoor.split(" ")

            if (compareDimension(goalStart, planetCoorArray) && compareDimension(goalEnd, planetCoorArray)) {
                isOne++
            }

            if (compareDimension(goalStart, planetCoorArray) || compareDimension(goalEnd, planetCoorArray)) {
                meetPlanetCount++
            }

        }

        println("${meetPlanetCount - isOne}")
    }
}

fun compareDimension(goalArray : Array<String>, planetCoorArray : List<String>) : Boolean {
    var xLength = goalArray[0].toInt() - planetCoorArray[0].toInt()
    var yLength = goalArray[1].toInt() - planetCoorArray[1].toInt()

    var dimension = sqrt(xLength.toDouble().pow(2.0) + yLength.toDouble().pow(2.0))

    return dimension < planetCoorArray[2].toDouble()
}