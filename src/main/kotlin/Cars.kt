interface Cars {
    fun cars(): List<Car>
    fun move()

    class ListCars(val cars: List<Car>) : Cars {
        override fun cars(): List<Car> {
            return cars
        }

        override fun move() {
            cars.forEach { it.move() }
        }
    }

    class StringCars(val carNames: String, var number: Number = Number.ZeroToNineNumber()) : Cars {
        private var cars: List<Car> = listOf()

        override fun cars(): List<Car> {
            create()
            return cars
        }

        override fun move() {
            create()
            cars.forEach { it.move() }
        }

        private fun create() {
            if (cars.size != 0) {
                return
            }
            cars = carNames.split(",")
                .map { Car(it, number) }
        }
    }
}
