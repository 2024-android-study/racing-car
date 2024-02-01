package racingcar.validator

import racingcar.config.ErrorMessageConstant

class InputValidator {
    fun checkCarNameLength(carName: String) {
        require(carName.length <= 5) {
            ErrorMessageConstant.ERROR_INVALID_CAR_NAME_LENGTH
        }
    }

    fun checkIsValidNumber(input: String) {
        require(input.all { it.isDigit() } && input.toInt() >= 0) {
            ErrorMessageConstant.ERROR_INVALID_NUMBER
        }
    }
}