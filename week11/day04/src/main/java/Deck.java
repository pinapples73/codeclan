import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;
    private Card card;

    public Deck(){
        this.deck = new ArrayList<Card>();

    }

    public int createDeck(){
        for(SuitType eachSuit: SuitType.values()){
            for(RankType eachRank: RankType.values()){
                Card card = new Card(eachSuit, eachRank);
                deck.add(card);
                System.out.println(deck);
            }
        }
        return deck.size();
    }


}
