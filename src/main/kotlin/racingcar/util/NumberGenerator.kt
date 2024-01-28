package racingcar.util

import camp.nextstep.edu.missionutils.Randoms

object NumberGenerator {
    fun generateRandomNumber(): Int {
        val number = Randoms.pickNumberInRange(0, 9)
        return number
    }
}