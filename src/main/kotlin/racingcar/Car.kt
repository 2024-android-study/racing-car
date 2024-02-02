package racingcar

class Car(val name: String, var distance: String = "") {
    fun goForwardOrStop(num: Int) {
        if(num >= 4) {
            distance += "-"
        }
    }
}