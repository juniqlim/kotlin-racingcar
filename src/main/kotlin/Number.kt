import kotlin.random.Random

interface Number {
    fun value(): Int

    class ZeroNumber : Number {
        override fun value(): Int {
            return 0
        }
    }

    class ZeroToNineNumber: Number {
        override fun value(): Int {
            return Random.nextInt(10)
        }
    }
}