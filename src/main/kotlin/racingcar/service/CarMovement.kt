package racingcar.service

import camp.nextstep.edu.missionutils.Randoms
import racingcar.config.NumberConfig.Companion.NUMBER_RANGE_END
import racingcar.config.NumberConfig.Companion.NUMBER_RANGE_START

class CarMovement {
    fun createRandNum(): Int {
        return Randoms.pickNumberInRange(NUMBER_RANGE_START, NUMBER_RANGE_END)
    }
}