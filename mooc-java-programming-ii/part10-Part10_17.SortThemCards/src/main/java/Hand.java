
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Hand implements Comparable<Hand> {
    private List<Card> cardList;
    
    public Hand() {
        this.cardList = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cardList.add(card);
    }
    
    public void print() {
        this.cardList.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(cardList);
    }

    @Override
    public int compareTo(Hand hand) {
        if(this.totalCardsValue() == hand.totalCardsValue()) {
            return 0;
        }
        
        if(this.totalCardsValue() > hand.totalCardsValue()) {
            return 1;
        }
        
        return -1;
    }
    
    public int totalCardsValue() {
        int sum = this.cardList.stream()
                .map(card -> card.getValue())
                .reduce(0, (previous, current) -> previous + current);
        
        return sum;
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit)
                                                .thenComparing(Card::getValue);
        
        Collections.sort(cardList, comparator);
    }
}
