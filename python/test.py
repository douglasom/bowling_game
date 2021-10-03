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

    def test_dutch_200_even(self):
        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)
        self.g.roll(9)
        self.g.roll(1)

        self.assertEqual(self.g.score(), 200)

    def test_dutch_200_odd(self):
        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(10)

        self.g.roll(9)
        self.g.roll(1)
        self.g.roll(10)

        self.assertEqual(self.g.score(), 200)

    def test_nine_spare_game(self):
        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)

        self.g.roll(9)
        self.g.roll(1)
        self.g.roll(9)

        self.assertEqual(self.g.score(), 190)


if __name__ == '__main__':
    unittest.main()