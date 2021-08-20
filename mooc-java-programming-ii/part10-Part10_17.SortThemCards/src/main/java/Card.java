public class Card implements Comparable<Card> {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14)
            throw new IllegalArgumentException("Card value must be in the range of 2...14");

        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String cardValue = String.valueOf(value);

        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    @Override
    public int compareTo(Card card) {
        if (this.getValue() == card.getValue())
            return this.getSuit().ordinal() - card.getSuit().ordinal();

        return this.value - card.value;
    }
}