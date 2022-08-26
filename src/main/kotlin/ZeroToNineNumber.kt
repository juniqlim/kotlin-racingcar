import kotlin.random.Random

class ZeroToNineNumber: Number {
    override fun value(): Int {
        return Random.nextInt(10)
    }
}
