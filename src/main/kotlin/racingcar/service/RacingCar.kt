package racingcar.service

import racingcar.validator.InputValidator
import racingcar.view.InputView

class RacingCar {

    val inputView = InputView()
    val validator = InputValidator()

    private lateinit var cars: List<String>

    fun run() {
        cars = inputView.readRaceCars()
        isValidCarLength()

    }

    private fun isValidCarLength() {
        for (car in cars) {
            validator.checkCarNameLength(car)
        }
    }
}