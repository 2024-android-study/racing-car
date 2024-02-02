package racingcar.util

import camp.nextstep.edu.missionutils.Randoms
import racingcar.constants.NumConstant

object RandomNumGenerator {
    // 랜덤값 생성
    fun generateNum(): Int {
        return Randoms.pickNumberInRange(NumConstant.MIN_RANDOM_NUM, NumConstant.MAX_RANDOM_NUM)
    }
}