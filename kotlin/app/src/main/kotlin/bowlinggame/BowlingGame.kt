package bowlinggame

<<<<<<< HEAD
import java.util.*

class BowlingGame {
    private var totalScore: Int = 0
    private var previousPins: Int = -1
    private var currentPins: Int = -1
    private var rollsToDouble: LinkedList<Int> = LinkedList()
    private var firstAttemptWithinFrame: Boolean = true
    private var frame: Int = 1

    fun roll(pins: Int) {
        currentPins = pins
        processBonus()
        totalScore += currentPins
        prepareBonus()
    }

    private fun processBonus() {
        if (rollsToDouble.isNotEmpty()) {
            val bonus = rollsToDouble.removeFirst()
            totalScore += bonus * currentPins
        }
    }

    private fun prepareBonus() {
        if (frame != 10) {
            if (strike()) {
                prepareStrikeBonus()
                frame++
            } else {
                if (spare()) {
                    prepareSpareBonus()
                }
                if (!firstAttemptWithinFrame) {
                    frame++
                }
                firstAttemptWithinFrame = !firstAttemptWithinFrame
                previousPins = currentPins
            }
        }
    }

    private fun strike() = firstAttemptWithinFrame && currentPins == 10

    private fun spare() = !firstAttemptWithinFrame && previousPins + currentPins == 10

    private fun prepareStrikeBonus() {
        prepareSpareBonus()
        prepareSecondRollBonus()
    }

    private fun prepareSpareBonus() {
        if (rollsToDouble.isEmpty()) {
            prepareSecondRollBonus()
        } else {
            rollsToDouble[0]++
        }
    }

    private fun prepareSecondRollBonus() {
        rollsToDouble += 1
    }

    fun score() : Int {
        return totalScore
=======
class BowlingGame {
    fun roll(pins: Int) {
    }

    fun score() : Int {
        return -1
>>>>>>> master
    }
}
