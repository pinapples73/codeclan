require('minitest/autorun')
require("minitest/reporters")
require('minitest/rg')

require_relative('../card_game.rb')
require_relative('../card.rb')

MiniTest::Reporters.use! Minitest::Reporters::SpecReporter.new

class TestCardGame < MiniTest::Test

  def setup
    @card1 = Card.new('Spades', 1)
    @card2 = Card.new('Hearts', 2)
    @card3 = Card.new('Diamonds', 3)
    @card_game = CardGame.new()
    @cards = [@card1, @card2, @card3]
  end

  def test_checkforace_true()
    expected_result = true
    actual_result = @card_game.checkforace(@card1)
    assert_equal(expected_result, actual_result)
  end


  def test_checkforace_false()
      expected_result = false
      actual_result = @card_game.checkforace(@card2)
      assert_equal(expected_result, actual_result)
  end

  def test_highest_card_card2()
      expected_result = @card2
      actual_result = @card_game.highest_card(@card1, @card2)
      assert_equal(expected_result, actual_result)
  end

  def test_highest_card_card1()
      expected_result = @card3
      actual_result = @card_game.highest_card(@card3,@card2)
      assert_equal(expected_result, actual_result)
  end

  def test_cards_total()
      expected_result = 6
      actual_result = CardGame.cards_total(@cards)
      assert_equal(expected_result, actual_result)
  end

end
