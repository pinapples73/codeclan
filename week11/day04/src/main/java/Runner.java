import java.sql.SQLOutput;
import java.util.ArrayList;

public class Runner {

    public Runner() {

    }

    public static void main(String[] args) {
        ArrayList<Card> dealtCards;

        Deck deck = new Deck();

        System.out.println("The Dealer is opening a new pack of cards...");
        deck.createDeck();

        System.out.println("The Dealer is now shuffling the deck...");
        deck.shuffleDeck();

        System.out.println("The Dealer is dealing the cards...");

        Card card1 = deck.dealCard();
        System.out.println("Iain gets dealt the: " + card1.getRank() + " of " + card1.getSuit());

        Card card2 = deck.dealCard();
        System.out.println("Ian gets dealt the: " + card2.getRank() + " of " + card2.getSuit());

        Card card3 = deck.dealCard();
        System.out.println("Speccy Pete gets dealt the: " + card3.getRank() + " of " + card3.getSuit());

        Card card4 = deck.dealCard();
        System.out.println("Handsome Pete gets dealt the: " + card4.getRank() + " of " + card4.getSuit());

        int maxValue = card1.getValue();
        String winner = "Iain";
        String message = "Its a WIN for ...";

        if(card2.getValue() > maxValue) {
            maxValue = card2.getValue();
            winner = " Ian";
        } else if(card2.getValue() == maxValue) {
            winner = winner + " and Ian";
            message = "Its a DRAW between...";
        }

        if(card3.getValue() > maxValue){
            maxValue = card3.getValue();
            winner = " Speccy Pete";
        } else if(card3.getValue() == maxValue) {
            winner = winner + " and Speccy Pete";
            message = "Its a DRAW between...";
        }

        if(card4.getValue() > maxValue){
            maxValue = card4.getValue();
            winner = " Handsome Pete";
        } else if(card4.getValue() == maxValue) {
            winner = winner + " and Handsome Pete";
            message = "Its a DRAW between...";
        }

        System.out.println(message);
        System.out.println(" ..." + winner);

    }
}
