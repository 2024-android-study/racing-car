package racingcar.service

import racingcar.validator.InputValidator
import racingcar.view.InputView

class RacingCar {

    val inputView = InputView()
    val validator = InputValidator()
    val converter = Converter()

    private lateinit var movementInfo: Map<String, Int>

    fun run() {
        val cars = inputView.readRaceCars()
        isValidCarLength(cars)

        val tryNum = inputView.readRaceTryNum()

        movementInfo = converter.mapCarNameToMoveNum(cars)
    }

    private fun isValidCarLength(cars: List<String>) {
        for (car in cars) {
            validator.checkCarNameLength(car)
        }
    }
}