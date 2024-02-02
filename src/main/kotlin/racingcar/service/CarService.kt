package racingcar.service

import racingcar.domain.Car
import racingcar.util.RandomNumGenerator

class CarService(names: List<String>) {

    private val numGenerator = RandomNumGenerator()
    private val cars = names.map { Car(it) }

    // 경주 시작
    fun race(): List<Car> {
        cars.forEach {
            it.move(numGenerator.generateNum()) // 랜덤값에 따라 전진함
        }

        return cars
    }

    // 가장 많이 이동한 거리 구하기
    private fun getMaxPosition(cars: List<Car>): Int {
        return cars.maxOf { it.position }
    }

    // 최종 우승자 구하기
    fun getWinner(): List<String> {
        val maxPosition = getMaxPosition(cars)
        return cars.filter { it.isSamePosition(maxPosition) }.map { it.name } // 해당 거리만큼 이동한 자동차 이름을 구함
    }
}