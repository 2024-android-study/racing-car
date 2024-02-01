package racingcar.service

import camp.nextstep.edu.missionutils.Randoms
import racingcar.config.NumberConfig.Companion.NUMBER_RANGE_END
import racingcar.config.NumberConfig.Companion.NUMBER_RANGE_START
import racingcar.validator.MoveValidator

class CarMovement {

    val validator = MoveValidator()

    fun createRandNum(): Int {
        return Randoms.pickNumberInRange(NUMBER_RANGE_START, NUMBER_RANGE_END)
    }

    fun addMovement(carName: String, info: MutableMap<String, Int>): MutableMap<String, Int> {
        if (validator.canMove(createRandNum())) {
            info[carName] = info[carName]!! + 1
//            info[carName] = info[carName]!!.toInt().plus(1)
        }
        return info
    }

    fun addCarsMovement(info: MutableMap<String, Int>): MutableMap<String, Int> {
        for ((key, value) in info) {
            if (validator.canMove(createRandNum())) {
                info[key] = value + 1
            }
        }
        return info
    }
}