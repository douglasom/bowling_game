import unittest
from game import Game


class TestGame(unittest.TestCase):

    def setUp(self):
        self.g = Game()

    def test_single_pin(self):
        self.g.roll(1)
        self.assertEqual(self.g.score(), 1)

    def test_gutter_game(self):
        for _ in range(10):
            self.g.roll(0)
        self.assertEqual(self.g.score(), 0)

    def test_all_ones(self):
        for _ in range(10):
            self.g.roll(1)
        self.assertEqual(self.g.score(), 10)

    def test_one_spare(self):
        self.g.roll(1)
        self.g.roll(9)
        self.g.roll(1)
        self.assertEqual(self.g.score(), 12)

    def test_one_strike(self):
        self.g.roll(10)
        self.g.roll(2)
        self.g.roll(1)
        self.assertEqual(self.g.score(), 10 + 2*2 + 2*1)

    def test_perfect_game(self):
        for _ in range(12):
            self.g.roll(10)
        self.assertEqual(self.g.score(), 300)

    # def test_roll_of_greater_than_10_raises_error(self):
    #     self.fail("Not yet implemented")
    #
    # def test_negative_roll_raises_error(self):
    #     self.fail("Not yet implemented")
    #
    # def test_frame_rolls_in_sum_greater_than_10_raises_error(self):
    #     self.fail("Not yet implemented")
    #
    # def test_more_than_21_rolls_raises_error(self):
    #     self.fail("Not yet implemented")
    #
    # def test_a_roll_after_2_non_bonus_rolls_in_10th_frame_raises_error(self):
    #     self.fail("Not yet implemented")
    #
    # def test_getting_score_with_11_strikes_raises_error(self):
    #     self.fail("Not yet implemented")
    #
    # def test_getting_score_with_10_spares_and_missed_bonus_raises_error(self):
    #     self.fail("Not yet implemented")
    #
    # def test_getting_score_with_19_ones_raises_error(self):
    #     self.fail("Not yet implemented")
    #
    # def test_getting_score_with_4_ones_raises_error(self):
    #     self.fail("Not yet implemented")


if __name__ == '__main__':
    unittest.main()