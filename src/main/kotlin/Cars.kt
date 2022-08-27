interface Cars {
    fun cars(): List<Car>
    fun move()
    fun show()
    fun winners(): List<Car>
    fun showWinner()

    class Smart {
        fun toCars(carNames: String, number: Number = Number.ZeroToNineNumber()): Cars {
            return ListCars(carNames.split(",")
                .map { Car(it, number) })
        }
    }

    class ListCars(val cars: List<Car>) : Cars {
        override fun cars(): List<Car> {
            return cars
        }

        override fun move() {
            cars.forEach { it.move() }
        }

        override fun show() {
            cars.forEach { it.show() }
        }

        override fun winners(): List<Car> {
            val maxPosition = cars.maxOf { it.position }
            return cars.filter { it.position == maxPosition }
        }

        override fun showWinner() {
            View.ConsoleView.showWinner(winners())
        }
    }
}
