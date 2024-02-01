package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.config.GameMessageConstant
import racingcar.service.Converter
import racingcar.validator.InputValidator

class InputView {

    private val converter = Converter()
    private val validator = InputValidator()

    fun readRaceCars(): List<String> {
        println(GameMessageConstant.INPUT_RACE_CARS)
        val input = Console.readLine()
        return converter.splitByComma(input)
    }

    fun readRaceTryNum(): Int {
        println(GameMessageConstant.INPUT_TRY_NUM)
        val input = Console.readLine()
        validator.checkIsValidNumber(input)
        return input.toInt()
    }
}