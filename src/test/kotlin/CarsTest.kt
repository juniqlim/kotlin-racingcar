import Number.NineNumber
import Number.ZeroNumber
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {
    @Test
    fun createByList() {
        assertThat(Cars.ListCars(listOf(Car("j", Number.ZeroToNineNumber()), Car("k", Number.ZeroToNineNumber()))).cars().size).isEqualTo(2)
    }

    @Test
    fun createByString() {
        assertThat(Cars.Smart().toCars("j,k,l").cars().size).isEqualTo(3)
    }

    @Test
    fun moveListCars() {
        val cars = Cars.ListCars(listOf(Car("j", NineNumber()), Car("k", NineNumber())))
        cars.move()
        assertThat(cars.cars().get(0).position).isEqualTo(1)
        assertThat(cars.cars().get(1).position).isEqualTo(1)
    }

    @Test
    fun moveStringCars() {
        val cars = Cars.Smart().toCars("j,k,l", NineNumber())
        cars.move()
        assertThat(cars.cars().get(0).position).isEqualTo(1)
        assertThat(cars.cars().get(1).position).isEqualTo(1)
        assertThat(cars.cars().get(2).position).isEqualTo(1)
    }

    @Test
    fun winner() {
        val j = Car("j", ZeroNumber())
        val k = Car("k", NineNumber())
        val l = Car("l", ZeroNumber())
        val cars = Cars.ListCars(listOf(j, k, l))
        cars.move()
        cars.move()
        cars.move()

        assertThat(cars.winners().get(0)).isEqualTo(k)
    }
}