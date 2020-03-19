import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS,RankType.QUEEN);

    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.QUEEN, card.getRank());
    }

    @Test
    public void queenHasValue10(){
        assertEquals(10, card.getValueFromEnum());
    }

//    @Test
//    public void suitCanBeMisspelled(){
//        card = new Card("Harts");
//        assertEquals("Harts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBannans(){
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }




}
