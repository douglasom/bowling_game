const Game = require("../Game");

describe('Game', () => {
  describe('score', () => {
    test('computes a single pin throw', () => {
      const game = Game();
      game.roll(3);
      expect(game.score()).toBe(3);
    });
  });
});