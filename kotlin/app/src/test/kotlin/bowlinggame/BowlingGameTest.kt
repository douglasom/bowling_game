package bowlinggame

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BowlingGameTest {

    private var game: BowlingGame = BowlingGame()

    @Before
    fun setUp() {
        game = BowlingGame()
    }

    @Test
    fun bowlingAllGuttersReturnsZeroScore() {
        // Arrange
        val expected = 0

        // Act
        game.roll(0)
        val actual = game.score()

        // Assert
        Assert.assertEquals(expected, actual)
    }

//    @Test
//    fun singlePins() {
//        Assert.fail("implement");
//    }
//
//    @Test
//    fun singleSpare() {
//        Assert.fail("implement");
//    }
//
//
//    @Test
//    fun singleStrike() {
//        Assert.fail("implement");
//    }
//
//    @Test
//    fun perfectGame() {
//        Assert.fail("implement");
//    }
//
//    @Test
//    fun dutch200Even() {
//        Assert.fail("implement");
//    }
//
//    @Test
//    fun dutch200Odd() {
//        Assert.fail("implement");
//    }
//
//    @Test
//    fun nineSpareGame() {
//        Assert.fail("implement");
//    }
}
