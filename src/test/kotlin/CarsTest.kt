import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {
    @Test
    fun test() {
        assertThat(Cars(arrayListOf(Car("j"), Car("k"))).cars.size).isEqualTo(2)
    }
}