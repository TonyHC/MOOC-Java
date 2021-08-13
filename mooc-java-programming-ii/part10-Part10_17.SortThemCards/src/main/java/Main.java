
import java.util.ArrayList;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        ArrayList<Card> cardList = new ArrayList<>();
        cardList.add(new Card(3, Suit.SPADE));
        cardList.add(new Card(2, Suit.DIAMOND));
        cardList.add(new Card(14, Suit.SPADE));
        cardList.add(new Card(12, Suit.HEART));
        cardList.add(new Card(2, Suit.SPADE));
        
        Collections.sort(cardList, new BySuitInValueOrder());
        
        cardList.stream().forEach(card -> System.out.println(card));
        
        System.out.println("--------");
        
        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();

        hand.print();
    }
}
