# frozen_string_literal: true

require_relative '../lib/game'

describe Game do
  let(:game) { ::Game.new }

  describe '#score' do
    it 'computes a single pin throw' do
      game.roll(3)
      expect(game.score).to eq 3
    end

    # it 'computes a gutter game' do
    #   fail 'Not implemented'
    # end
    #
    # it 'computes a all ones game' do
    #   fail 'Not implemented'
    # end
    #
    # it 'computes a single spare' do
    #   fail 'Not implemented'
    # end
    #
    # it 'computes a single strike' do
    #   fail 'Not implemented'
    # end
    #
    # it 'computes a perfect game' do
    #   fail 'Not implemented'
    # end
    #
    # it 'computes a dutch 200 even game' do
    #   fail 'Not implemented'
    # end
    #
    # it 'computes a dutch 200 odd game' do
    #   fail 'Not implemented'
    # end
    #
    # it 'computes a nine spare game' do
    #   fail 'Not implemented'
    # end
  end
end
