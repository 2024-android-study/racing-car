package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.config.GameMessageConstant
import racingcar.service.Converter

class InputView {

    private val converter = Converter()

    fun readRaceCars(): List<String> {
        println(GameMessageConstant.INPUT_RACE_CARS)
        val input = Console.readLine()
        return converter.splitByComma(input)
    }
}