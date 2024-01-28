package racingcar.View

import racingcar.Constants.ErrorConstant
import racingcar.Constants.ViewConstant

class InputView {
    // 자동차 이름 입력 받음
    fun inputCarName(): List<String> {
        println(ViewConstant.INPUT_CAR)
        val input = readlnOrNull()?.split(',')?.map { checkCarNameLength(it) }

        return input ?: listOf("")
    }

    // 자동차 이름 길이 확인
    private fun checkCarNameLength(name: String): String {
        require(name.length in 1..5) { ErrorConstant.ERROR_INPUT_CAR_NAME_LENGTH }
        return name
    }

    // 시도 횟수 입력 받음
    fun inputTrialNum(): Int {
        println(ViewConstant.INPUT_MOVE_CNT)
        val input = readlnOrNull()

        checkTrialNum(input!!)

        return input.toInt()
    }

    private fun checkTrialNum(input: String) {
        require((isNumber(input))) {ErrorConstant.ERROR_INPUT_NUM}
    }

    private fun isNumber(input: String): Boolean {
        return input.all { ch -> ch.isDigit() }
    }
}