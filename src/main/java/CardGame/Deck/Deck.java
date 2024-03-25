package CardGame.Deck;

import CardGame.Card.Card;

import java.util.*;

public class Deck {
    private static final List<Card> CARDS_IN_DEFAULT_ORDER = new ArrayList<>() {{
        add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
        add(Card.of(Card.Suit.SPADE, Card.Rank.TWO));
        add(Card.of(Card.Suit.SPADE, Card.Rank.THREE));
        add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
        add(Card.of(Card.Suit.SPADE, Card.Rank.FIVE));
        add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
        add(Card.of(Card.Suit.SPADE, Card.Rank.SEVEN));
        add(Card.of(Card.Suit.SPADE, Card.Rank.EIGHT));
        add(Card.of(Card.Suit.SPADE, Card.Rank.NINE));
        add(Card.of(Card.Suit.SPADE, Card.Rank.TEN));
        add(Card.of(Card.Suit.SPADE, Card.Rank.JACK));
        add(Card.of(Card.Suit.SPADE, Card.Rank.QUEEN));
        add(Card.of(Card.Suit.SPADE, Card.Rank.KING));
        add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
        add(Card.of(Card.Suit.HEART, Card.Rank.TWO));
        add(Card.of(Card.Suit.HEART, Card.Rank.THREE));
        add(Card.of(Card.Suit.HEART, Card.Rank.FOUR));
        add(Card.of(Card.Suit.HEART, Card.Rank.FIVE));
        add(Card.of(Card.Suit.HEART, Card.Rank.SIX));
        add(Card.of(Card.Suit.HEART, Card.Rank.SEVEN));
        add(Card.of(Card.Suit.HEART, Card.Rank.EIGHT));
        add(Card.of(Card.Suit.HEART, Card.Rank.NINE));
        add(Card.of(Card.Suit.HEART, Card.Rank.TEN));
        add(Card.of(Card.Suit.HEART, Card.Rank.JACK));
        add(Card.of(Card.Suit.HEART, Card.Rank.QUEEN));
        add(Card.of(Card.Suit.HEART, Card.Rank.KING));
        add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
        add(Card.of(Card.Suit.CLUB, Card.Rank.TWO));
        add(Card.of(Card.Suit.CLUB, Card.Rank.THREE));
        add(Card.of(Card.Suit.CLUB, Card.Rank.FOUR));
        add(Card.of(Card.Suit.CLUB, Card.Rank.FIVE));
        add(Card.of(Card.Suit.CLUB, Card.Rank.SIX));
        add(Card.of(Card.Suit.CLUB, Card.Rank.SEVEN));
        add(Card.of(Card.Suit.CLUB, Card.Rank.EIGHT));
        add(Card.of(Card.Suit.CLUB, Card.Rank.NINE));
        add(Card.of(Card.Suit.CLUB, Card.Rank.TEN));
        add(Card.of(Card.Suit.CLUB, Card.Rank.JACK));
        add(Card.of(Card.Suit.CLUB, Card.Rank.QUEEN));
        add(Card.of(Card.Suit.CLUB, Card.Rank.KING));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.ACE));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.TWO));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.THREE));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.FOUR));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.FIVE));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.SIX));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.SEVEN));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.NINE));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.TEN));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.JACK));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.QUEEN));
        add(Card.of(Card.Suit.DIAMOND, Card.Rank.KING));
    }};
    public static final int DEFAULT_DECK_SIZE = CARDS_IN_DEFAULT_ORDER.size();
    private List<Card> cards;

    private Deck(List<Card> cards) {
        this.cards = cards;
    }

    public static Deck create() {
        List<Card> cards = new ArrayList<>();
        cards.addAll(CARDS_IN_DEFAULT_ORDER);
        return new Deck(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void reset() {
        cards.removeAll(cards);
        cards.addAll(CARDS_IN_DEFAULT_ORDER);
    }

    public void sort(Boolean isSuitSortOrderAscending, Boolean isRankSortOrderAscending) {
        Comparator<Card> suitComparator = null;
        Comparator<Card> rankComparator = null;
        Comparator<Card> cardComparator = null;
        boolean isSuitAndRankSortOrderNotNull = ((isSuitSortOrderAscending != null) && (isRankSortOrderAscending != null));

        if (isSuitSortOrderAscending != null) {
            suitComparator = Comparator.comparing(Card::getSuit);

            if (isSuitSortOrderAscending) {
                suitComparator = suitComparator.reversed();
            }
        }

        if (isRankSortOrderAscending != null) {
            rankComparator = Comparator.comparing(Card::getRank);

            if (!isRankSortOrderAscending) {
                rankComparator = rankComparator.reversed();
            }
        }

        if (isSuitAndRankSortOrderNotNull) {
            cardComparator = suitComparator.thenComparing(rankComparator);
        } else if (isSuitSortOrderAscending == null) {
            cardComparator = rankComparator;
        } else if (isRankSortOrderAscending == null) {
            cardComparator = suitComparator;
        }
        Collections.sort(cards, cardComparator);
    }

    public Card draw(drawnStartPosition drawnStartPosition) {
        int drawnCardIndex = 0;

        switch (drawnStartPosition) {
            case FROM_TOP:
                drawnCardIndex = 0;
                break;
            case FROM_BOTTOM:
                drawnCardIndex = cards.size() - 1;
        }

        try {
            Card drawnCard = cards.get(drawnCardIndex);
            cards.remove(drawnCard);
            return drawnCard;
        } catch (Error e) {
            throw new EmptyDeckException("The deck is empty!");
        }
    }

    public Card draw(int drawnCardIndex) {
        if (drawnCardIndex > cards.size() || cards.isEmpty()) {
            throw new EmptyDeckException("The deck is empty!");
        } else {
            Card drawnCard = cards.get(drawnCardIndex - 1);
            cards.remove(drawnCard);
            return drawnCard;
        }
    }

    public int size() {
        if (cards.isEmpty()) {
            return 0;
        } else {
            return cards.size();
        }
    }

    public boolean contains(Card card) {
        if (cards.isEmpty()) {
            return false;
        } else {
            return cards.contains(card);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "{\"cards\"=" + cards + "}";
    }

    public enum drawnStartPosition {
        FROM_TOP, FROM_BOTTOM;
    }
}