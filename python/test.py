import unittest
from game import Game


class TestGame(unittest.TestCase):

    def setUp(self):
        self.g = Game()

    def test_single_pin(self):
        self.g.roll(3)
        self.assertEqual(self.g.score(), 3)

    # def test_gutter_game(self):
    #     self.fail("Not yet implemented")

    # def test_all_ones(self):
    #     self.fail("Not yet implemented")
    #
    # def test_one_spare(self):
    #     self.fail("Not yet implemented")
    #
    # def test_one_strike(self):
    #     self.fail("Not yet implemented")
    #
    # def test_perfect_game(self):
    #     self.fail("Not yet implemented")
    #
    # def test_dutch_200_even(self):
    #     self.fail("Not yet implemented")
    #
    # def test_dutch_200_odd(self):
    #     self.fail("Not yet implemented")
    #
    # def test_nine_spare_game(self):
    #     self.fail("Not yet implemented")


if __name__ == '__main__':
    unittest.main()