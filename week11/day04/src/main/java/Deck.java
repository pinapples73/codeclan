import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<Card>();
    }

    public void createDeck(){
        for(SuitType eachSuit: SuitType.values()){
            for(RankType eachRank: RankType.values()){
                Card card = new Card(eachSuit, eachRank);
                deck.add(card);
            }
        }
    }

    public int getDeck(){
        return deck.size();
    }

    public void shuffleDeck(){
//        System.out.println(deck);
        Collections.shuffle(deck);
//        System.out.println(deck);
    }

    public Card dealCard(){
        Card dealtCard = deck.get(0);
        deck.remove(dealtCard);
        return dealtCard;

    }

    public Card getCardFromDeck(int index){
        return deck.get(index);
    }


}
