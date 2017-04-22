import org.junit.Test
import kotlin.test.assertEquals

/**
 * [2017-04-17] Challenge #311 [Easy] Jolly Jumper
 */
class JollyJumperTest {

    @Test
    fun challengeInput() {
        assertEquals(true, isJollyJumper("4 1 4 2 3"), "JOLLY")
        assertEquals(false, isJollyJumper( "5 1 4 2 -1 6"), "NOT JOLLY")
        assertEquals(false, isJollyJumper("4 19 22 24 21"), "NOT JOLLY")
        assertEquals(true, isJollyJumper("4 19 22 24 25"), "JOLLY")
        assertEquals(true, isJollyJumper("4 2 -1 0 2"), "JOLLY")
    }
}