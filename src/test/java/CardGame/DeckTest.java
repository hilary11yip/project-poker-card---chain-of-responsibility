package CardGame;

import CardGame.Card.Card;
import CardGame.Deck.Deck;
import CardGame.Deck.EmptyDeckException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    List<Card> CARDS_IN_DEFAULT_ORDER = new ArrayList<>() {{
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

    @Test
    public void shouldReturnCardsInDefaultOrder_WhenCreateDeck() {
        Deck deck = Deck.create();
        assertEquals(CARDS_IN_DEFAULT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnFalse_WhenShuffleDeck() {
        Deck deck = Deck.create();
        deck.shuffle();
        assertNotEquals(CARDS_IN_DEFAULT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnCardsInDefaultOrder_WhenResetDeck() {
        Deck deck = Deck.create();
        deck.shuffle();
        deck.reset();
        assertEquals(CARDS_IN_DEFAULT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnCards_SuitInDescendingOrder_WhenSortDeck() {
        List<Card> CARDS_IN_CORRECT_ORDER = new ArrayList<>() {{
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
        Deck deck = Deck.create();
        deck.sort(false, null);
        assertEquals(CARDS_IN_CORRECT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnCards_RankInDescendingOrder_WhenSortDeck() {
        List<Card> CARDS_IN_CORRECT_ORDER = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
            add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.ACE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.KING));
            add(Card.of(Card.Suit.HEART, Card.Rank.KING));
            add(Card.of(Card.Suit.CLUB, Card.Rank.KING));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.KING));
            add(Card.of(Card.Suit.SPADE, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.JACK));
            add(Card.of(Card.Suit.HEART, Card.Rank.JACK));
            add(Card.of(Card.Suit.CLUB, Card.Rank.JACK));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.JACK));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.TEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.TEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.TEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.NINE));
            add(Card.of(Card.Suit.HEART, Card.Rank.NINE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.NINE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.NINE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.HEART, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.CLUB, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.SPADE, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
            add(Card.of(Card.Suit.HEART, Card.Rank.SIX));
            add(Card.of(Card.Suit.CLUB, Card.Rank.SIX));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.SIX));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FIVE));
            add(Card.of(Card.Suit.HEART, Card.Rank.FIVE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.FIVE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.FIVE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
            add(Card.of(Card.Suit.HEART, Card.Rank.FOUR));
            add(Card.of(Card.Suit.CLUB, Card.Rank.FOUR));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.FOUR));
            add(Card.of(Card.Suit.SPADE, Card.Rank.THREE));
            add(Card.of(Card.Suit.HEART, Card.Rank.THREE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.THREE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.THREE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TWO));
            add(Card.of(Card.Suit.HEART, Card.Rank.TWO));
            add(Card.of(Card.Suit.CLUB, Card.Rank.TWO));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.TWO));
        }};
        Deck deck = Deck.create();
        deck.sort(null, false);
        assertEquals(CARDS_IN_CORRECT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnCards_SuitAndRankInAscendingOrder_WhenSortDeck() {
        List<Card> CARDS_IN_CORRECT_ORDER = new ArrayList<>() {{
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
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.ACE));
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
            add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
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
            add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
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
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
        }};
        Deck deck = Deck.create();
        deck.sort(true, true);
        assertEquals(CARDS_IN_CORRECT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnCards_SuitAndRankInDescendingOrder_WhenSortDeck() {
        List<Card> CARDS_IN_CORRECT_ORDER = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.KING));
            add(Card.of(Card.Suit.SPADE, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.JACK));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.NINE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.SPADE, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FIVE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
            add(Card.of(Card.Suit.SPADE, Card.Rank.THREE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TWO));
            add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
            add(Card.of(Card.Suit.HEART, Card.Rank.KING));
            add(Card.of(Card.Suit.HEART, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.JACK));
            add(Card.of(Card.Suit.HEART, Card.Rank.TEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.NINE));
            add(Card.of(Card.Suit.HEART, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.HEART, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.SIX));
            add(Card.of(Card.Suit.HEART, Card.Rank.FIVE));
            add(Card.of(Card.Suit.HEART, Card.Rank.FOUR));
            add(Card.of(Card.Suit.HEART, Card.Rank.THREE));
            add(Card.of(Card.Suit.HEART, Card.Rank.TWO));
            add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.KING));
            add(Card.of(Card.Suit.CLUB, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.JACK));
            add(Card.of(Card.Suit.CLUB, Card.Rank.TEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.NINE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.CLUB, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.SIX));
            add(Card.of(Card.Suit.CLUB, Card.Rank.FIVE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.FOUR));
            add(Card.of(Card.Suit.CLUB, Card.Rank.THREE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.TWO));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.ACE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.KING));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.JACK));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.TEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.NINE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.SIX));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.FIVE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.FOUR));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.THREE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.TWO));
        }};
        Deck deck = Deck.create();
        deck.sort(false, false);
        assertEquals(CARDS_IN_CORRECT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnCards_SuitInAscendingOrder_RankInDescendingOrder_WhenSortDeck() {
        List<Card> CARDS_IN_CORRECT_ORDER = new ArrayList<>() {{
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.ACE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.KING));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.JACK));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.TEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.NINE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.SIX));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.FIVE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.FOUR));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.THREE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.TWO));
            add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.KING));
            add(Card.of(Card.Suit.CLUB, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.JACK));
            add(Card.of(Card.Suit.CLUB, Card.Rank.TEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.NINE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.CLUB, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.SIX));
            add(Card.of(Card.Suit.CLUB, Card.Rank.FIVE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.FOUR));
            add(Card.of(Card.Suit.CLUB, Card.Rank.THREE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.TWO));
            add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
            add(Card.of(Card.Suit.HEART, Card.Rank.KING));
            add(Card.of(Card.Suit.HEART, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.JACK));
            add(Card.of(Card.Suit.HEART, Card.Rank.TEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.NINE));
            add(Card.of(Card.Suit.HEART, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.HEART, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.HEART, Card.Rank.SIX));
            add(Card.of(Card.Suit.HEART, Card.Rank.FIVE));
            add(Card.of(Card.Suit.HEART, Card.Rank.FOUR));
            add(Card.of(Card.Suit.HEART, Card.Rank.THREE));
            add(Card.of(Card.Suit.HEART, Card.Rank.TWO));
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.KING));
            add(Card.of(Card.Suit.SPADE, Card.Rank.QUEEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.JACK));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.NINE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.EIGHT));
            add(Card.of(Card.Suit.SPADE, Card.Rank.SEVEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FIVE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
            add(Card.of(Card.Suit.SPADE, Card.Rank.THREE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TWO));
        }};
        Deck deck = Deck.create();
        deck.sort(true, false);
        assertEquals(CARDS_IN_CORRECT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnCards_SuitInDescendingOrder_RankInAscendingOrder_WhenSortDeck() {
        List<Card> CARDS_IN_CORRECT_ORDER = new ArrayList<>() {{
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
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
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
            add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
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
            add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
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
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.ACE));
        }};
        Deck deck = Deck.create();
        deck.sort(false, true);
        assertEquals(CARDS_IN_CORRECT_ORDER, deck.getCards());
    }

    @Test
    public void shouldReturnTopCard_WhenDrawFromTop() {
        Deck deck = Deck.create();
        Card drawnCard = deck.draw(Deck.drawnStartPosition.FROM_TOP);
        Card expectedCard = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        assertEquals(expectedCard, drawnCard);
    }

    @Test
    public void shouldReturnBottomCard_WhenDrawFromBottom() {
        Deck deck = Deck.create();
        Card drawnCard = deck.draw(Deck.drawnStartPosition.FROM_BOTTOM);
        Card expectedCard = Card.of(Card.Suit.DIAMOND, Card.Rank.KING);
        assertEquals(expectedCard, drawnCard);
    }

    @Test
    public void shouldReturnSpecificCard_WhenDrawFromMiddle() {
        Deck deck = Deck.create();
        Card drawnCard = deck.draw(10);
        Card expectedCard = Card.of(Card.Suit.SPADE, Card.Rank.TEN);
        assertEquals(expectedCard, drawnCard);
    }

    @Test()
    public void shouldReturnFalse_WhenDeckNotContainTheCard() {
        Deck deck = Deck.create();
        deck.draw(13);
        Card expectedCard = Card.of(Card.Suit.SPADE, Card.Rank.KING);
        assertFalse(deck.contains(expectedCard));
    }

    @Test()
    public void shouldReturnTrue_WhenDeckContainTheCard() {
        Deck deck = Deck.create();
        deck.draw(13);
        Card expectedCard = Card.of(Card.Suit.SPADE, Card.Rank.ACE);
        assertTrue(deck.contains(expectedCard));
    }

    @Test()
    public void shouldReturnEmptyDeckException_WhenDrawEmptyDeck() {
        Deck deck = Deck.create();
        deck.setCards(new ArrayList<>());
        assertThrows(EmptyDeckException.class, () -> deck.draw(10));
    }

}