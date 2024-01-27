package racingcar.model

class Car(private val name: String) {
    private var distance = ""

    fun move()  = MOVE_GO

    fun stop() = MOVE_STOP

    fun addDistance(isGo: Boolean) {
        if (isGo) distance += "-"

    }

    fun getNameWithDistance(): Pair<String, String> = name to distance

    companion object {
        private const val MOVE_GO = true
        private const val MOVE_STOP = false
    }
}
