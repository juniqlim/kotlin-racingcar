import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {
    @Test
    fun createByList() {
        assertThat(Cars.ListCars(listOf(Car("j", ZeroToNineNumber()), Car("k", ZeroToNineNumber()))).cars().size).isEqualTo(2)
    }

    @Test
    fun createByString() {
        assertThat(Cars.StringCars("j,k,l").cars().size).isEqualTo(3)
    }
}