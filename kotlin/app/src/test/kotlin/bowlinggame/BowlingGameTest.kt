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

<<<<<<< HEAD
    @Test
    fun singlePins() {
        // Arrange
        val expected = 10

        // Act
        repeat(10) { game.roll(1) }
        val actual = game.score()

        // Assert
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun singleSpare() {
        // Arrange
        val expected = 18

        // Act
        game.roll(9)
        game.roll(1)
        game.roll(4)
        val actual = game.score()

        // Assert
        Assert.assertEquals(expected, actual)
    }


    @Test
    fun singleStrike() {
        // Arrange
        val expected = 16

        // Act
        game.roll(10)
        game.roll(1)
        game.roll(2)
        val actual = game.score()

        // Assert
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun perfectGame() {
        // Arrange
        val expected = 300

        // Act
        repeat(12) { game.roll(10) }
        val actual = game.score()

        // Assert
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun dutch200Even() {
        // Arrange
        val expected = 200

        // Act
        game.roll(9)
        game.roll(1)

        game.roll(10)

        game.roll(9)
        game.roll(1)

        game.roll(10)

        game.roll(9)
        game.roll(1)

        game.roll(10)

        game.roll(9)
        game.roll(1)

        game.roll(10)

        game.roll(9)
        game.roll(1)

        game.roll(10)
        game.roll(9)
        game.roll(1)
        val actual = game.score()

        // Assert
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun dutch200Odd() {
        // Arrange
        val expected = 200

        // Act
        game.roll(10)
        game.roll(9)
        game.roll(1)
        game.roll(10)
        game.roll(9)
        game.roll(1)
        game.roll(10)
        game.roll(9)
        game.roll(1)
        game.roll(10)
        game.roll(9)
        game.roll(1)
        game.roll(10)

        game.roll(9)
        game.roll(1)
        game.roll(10)
        val actual = game.score()

        // Assert
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun nineSpareGame() {
        // Arrange
        val expected = 190

        // Act
        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)

        game.roll(9)
        game.roll(1)
        game.roll(9)

        val actual = game.score()

        // Assert
        Assert.assertEquals(expected, actual)
    }
=======
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
>>>>>>> master
}
