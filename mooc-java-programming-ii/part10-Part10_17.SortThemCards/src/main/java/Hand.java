import java.util.*;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void checkCards (int cardValue) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            Card nextCard = iterator.next();
            if (nextCard.getValue() == cardValue)
                System.out.println(nextCard);
        }
    }

    public void checkCards (Suit suit) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            Card nextCard = iterator.next();
            if (nextCard.getSuit() == suit)
                System.out.println(nextCard);
        }
    }

    public void removeCards(int cardValue) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() < cardValue)
                iterator.remove();
        }
    }

    public void removeCards(Suit suit) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getSuit() == suit)
                iterator.remove();
        }
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            Card nextCard = iterator.next();
            System.out.println(nextCard);
        }
    }

    public int totalCardValues() {
        int cardValues = 0;
        for (Card card : cards)
            cardValues += card.getValue();
        return cardValues;
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, (c1,c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
    }

    public void sortBySuitInValueOrder() {
        // Collections.sort(cards, new BySuitInValueOrder());
        Collections.sort(cards, (c1,c2) -> {
            if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
                return c1.getValue() - c2.getValue();
            }

            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        });
    }

    @Override
    public int compareTo(Hand hand) {
        return this.totalCardValues() - hand.totalCardValues();
    }
}
