package view

import racingcar.Car

class OutputView {
    companion object {
        private const val START = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
        private const val TIME = "시도할 횟수는 몇 회인가요?"
        private const val RESULT = "\n실행 결과"
        private const val WINNER = "최종 우승자 : "
    }

    fun printStart() {
        println(START)
    }

    fun printTime() {
        println(TIME)
    }

    fun printResultTitle() {
        println(RESULT)
    }

    fun printResult(cars: List<Car>) {
        for (car in cars) {
            println("${car.name} : ${car.distance}")
        }
        println()
    }

    fun printWinners(cars: List<String>) {
        var str = "$WINNER"
        for(i in cars.indices) {
            str += if(i == cars.size - 1) "${cars[i]}" else "${cars[i]}, "
        }
        print(str)
    }
}