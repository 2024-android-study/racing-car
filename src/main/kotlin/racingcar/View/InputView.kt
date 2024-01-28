package racingcar.View

import racingcar.Constants.ViewConstant
import camp.nextstep.edu.missionutils.Console
import racingcar.service.Validator

class InputView {
    private val validator = Validator()

    // 자동차 이름 입력 받음
    fun inputCarName(): List<String> {
        println(ViewConstant.INPUT_CAR)
        val input = Console.readLine()?.replace(" ", "")?.split(',')?.map { validator.checkCarNameLength(it) }

        return input ?: listOf("")
    }

    // 시도 횟수 입력 받음
    fun inputTrialNum(): Int {
        println(ViewConstant.INPUT_MOVE_CNT)
        val input = Console.readLine()

        validator.checkTrialNum(input)

        return input.toInt()
    }
}