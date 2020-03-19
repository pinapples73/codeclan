import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void testGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void testGetRank(){
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void testCardHasValue(){
        assertEquals(1, card.getValue());
    }

}
