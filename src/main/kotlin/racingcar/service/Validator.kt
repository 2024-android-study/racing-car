package racingcar.service

import racingcar.constants.ErrorConstant
import racingcar.constants.NumConstant

class Validator {
    // 자동차 이름 길이 확인
    fun checkCarNameLength(name: String): String {
        require(name.length in NumConstant.MIN_NAME_LENGTH..NumConstant.MAX_NAME_LENGTH) { ErrorConstant.ERROR_INPUT_CAR_NAME_LENGTH }
        return name
    }

    // 시도 횟수 입력값 검증
    fun checkTrialNum(input: String) {
        require((isNumber(input))) { ErrorConstant.ERROR_INPUT_NUM }
        require(input.toInt() == NumConstant.ZERO) { ErrorConstant.ERROR_INPUT_TRIAL_NUM_ZERO }
    }

    private fun isNumber(input: String): Boolean {
        return input.all { ch -> ch.isDigit() }
    }
}