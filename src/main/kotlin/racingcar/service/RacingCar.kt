package racingcar.service

import racingcar.validator.InputValidator
import racingcar.view.InputView

class RacingCar {

    val inputView = InputView()
    val validator = InputValidator()
    val converter = Converter()

    private lateinit var cars: List<String>
    private var tryNum = 0

    fun run() {
        cars = inputView.readRaceCars()
        isValidCarLength()

        tryNum = inputView.readRaceTryNum()

        val map = converter.mapCarNameToMoveNum(cars)
        println(map)
    }

    private fun isValidCarLength() {
        for (car in cars) {
            validator.checkCarNameLength(car)
        }
    }
}