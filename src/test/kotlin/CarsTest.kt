import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {
    @Test
    fun test() {
        assertThat(Cars(arrayListOf(Car("j", ZeroToNineNumber()), Car("k", ZeroToNineNumber()))).cars.size).isEqualTo(2)
    }
}