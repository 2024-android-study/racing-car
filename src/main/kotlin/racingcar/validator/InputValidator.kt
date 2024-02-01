package racingcar.validator

import racingcar.config.ErrorMessageConstant

class InputValidator {
    fun checkCarNameLength(carName: String) {
        require(carName.length <= 5) {
            ErrorMessageConstant.ERROR_INVALID_CAR_NAME_LENGTH
        }
    }
}