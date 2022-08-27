interface Cars {
    fun cars(): List<Car>

    class ListCars(val cars: List<Car>) : Cars {
        override fun cars(): List<Car> {
            return cars
        }
    }

    class StringCars(val carNames: String) : Cars {
        var cars: List<Car> = listOf()
        override fun cars(): List<Car> {
            if (cars.size == 0) {
                create()
            }
            return cars
        }

        private fun create() {
            cars = carNames.split(",")
                .map { Car(it, Number.ZeroToNineNumber()) }
        }
    }
}
