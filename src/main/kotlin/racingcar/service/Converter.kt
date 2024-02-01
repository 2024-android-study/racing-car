package racingcar.service

class Converter {
    fun splitByComma(str: String): List<String> {
        return str.split(",")
    }
    fun mapCarNameToMoveNum(cars: List<String>): Map<String, Int> {
        return cars.associateWith { 0 } // cars.map { it to 0 }.toMap()
    }

    fun intToMovementString(move: Int): String {
        var result = ""
        for (i: Int in 0 until move) {
            result += "-"
        }
        return result
    }
}