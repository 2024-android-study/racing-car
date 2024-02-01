package racingcar.validator

import racingcar.config.NumberConfig.Companion.MOVE_CRITERIA

class MoveValidator {
    fun canMove(num: Int): Boolean {
        return (num >= MOVE_CRITERIA)
    }
}