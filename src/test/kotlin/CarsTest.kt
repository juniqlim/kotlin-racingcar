import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {
    @Test
    fun createByList() {
        assertThat(Cars.ListCars(listOf(Car("j", Number.ZeroToNineNumber()), Car("k", Number.ZeroToNineNumber()))).cars().size).isEqualTo(2)
    }

    @Test
    fun createByString() {
        assertThat(Cars.StringCars("j,k,l").cars().size).isEqualTo(3)
    }

    @Test
    fun moveListCars() {
        val cars = Cars.ListCars(listOf(Car("j", Number.NineNumber()), Car("k", Number.NineNumber())))
        cars.move()
        assertThat(cars.cars().get(0).position).isEqualTo(1)
        assertThat(cars.cars().get(1).position).isEqualTo(1)
    }

    @Test
    fun moveStringCars() {
        val cars = Cars.StringCars("j,k,l", Number.NineNumber())
        cars.move()
        assertThat(cars.cars().get(0).position).isEqualTo(1)
        assertThat(cars.cars().get(1).position).isEqualTo(1)
        assertThat(cars.cars().get(2).position).isEqualTo(1)
    }
}