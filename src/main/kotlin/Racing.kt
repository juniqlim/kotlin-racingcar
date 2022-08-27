import java.util.Scanner

class Racing(val carNames: String, val tryNumber: Int) {
    fun run() {
        val cars = Cars.Smart().toCars(carNames)
        (0..tryNumber).forEach {
            cars.move()
            cars.show()
            println()
        }
        cars.showWinner()
    }
}

fun main() {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val input = Scanner(System.`in`)
    val carNames = input.next()
    println("시도할 회수는 몇회인가요?")
    val tryNumber = input.nextInt()
    Racing(carNames, tryNumber).run()
}