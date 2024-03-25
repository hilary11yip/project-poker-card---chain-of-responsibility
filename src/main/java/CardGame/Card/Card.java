package CardGame.Card;

import java.util.Objects;

public final class Card implements Comparable<Card> {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static Card of(Suit suit, Rank rank) {
        return new Card(suit, rank);
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "{\"Suit\"=\"" + suit + "\", \"Rank\"=" + rank + "\"}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public int compareTo(Card o) {
        boolean isEqualRank = (o.rank.value == this.rank.value);
        boolean isEqualSuit = (o.suit.value == this.suit.value);

        if(isEqualRank){
            return this.suit.value - o.suit.value;
        }
        else if(isEqualSuit){
            return this.rank.value - o.rank.value;
        }
        else{
            return 0;
        }
    }

    public enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);
        public final int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum Suit {
        SPADE(4),
        HEART(3),
        CLUB(2),
        DIAMOND(1);
        private final int value;

        Suit(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
