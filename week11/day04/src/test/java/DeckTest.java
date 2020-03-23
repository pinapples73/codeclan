import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

   @Test
    public void testSuitCheck(){
        deck.createDeck();
        assertEquals(52, deck.getDeck());
   }

  @Test
   public void testGetCardFromDeck(){
       deck.createDeck();

       Card cardResult = deck.getCardFromDeck(0);
       String suitResult = cardResult.getSuit().toString();
       String rankResult = cardResult.getRank().toString();
       String result = rankResult + " of " + suitResult;

       assertEquals("ACE of HEARTS", result);
   }

    @Test
    public void testShuffleDeck(){
        deck.createDeck();
        deck.shuffleDeck();

        Card cardResult = deck.getCardFromDeck(0);
        String suitResult = cardResult.getSuit().toString();
        String rankResult = cardResult.getRank().toString();
        String result = rankResult + " of " + suitResult;

        assertNotEquals("ACE of HEARTS", result);
    }

   @Test
    public void testDealing(){
        deck.createDeck();
        deck.shuffleDeck();
        deck.dealCard();
        assertEquals(51, deck.getDeck());
   }




}
