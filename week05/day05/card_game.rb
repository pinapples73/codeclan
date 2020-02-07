### Testing task 2 code:

# Carry out dynamic testing on the code below.
# Correct the errors below that you spotted in task 1.

class CardGame


  def checkforace(card)
    #changed = to ==
    if card.value == 1
      return true
    else
      return false
    end
  end

  #changed dif to def
  def highest_card(card1, card2)
    #added , between parameters
    if card1.value > card2.value
      #changed card to card1
      return card1
    else
      return card2
    end
  end


  def self.cards_total(cards)
    #added a value to total
    total = 0
    for card in cards
      total += card.value

    end
    #changed string below so it excepted total
    #moved it out of for loop so it returned actual total
      return "You have a total of #{total}"
  end
#moved class end to here to include cards_total in class
end
