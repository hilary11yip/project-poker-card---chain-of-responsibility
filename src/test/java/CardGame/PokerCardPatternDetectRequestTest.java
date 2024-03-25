package CardGame;

import CardGame.Card.Card;
import CardGame.PatternDetector.PokerCardPattern.PokerCardPattern;
import CardGame.PatternDetector.PokerCardPattern.PokerCardPatternDetectRequest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PokerCardPatternDetectRequestTest {
    @Test
    public void shouldReturnRoyalFlush_GivenRoyalFlushCards() {
        List<Card> cards = new ArrayList<>() {{
                add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
                add(Card.of(Card.Suit.SPADE, Card.Rank.QUEEN));
                add(Card.of(Card.Suit.SPADE, Card.Rank.TEN));
                add(Card.of(Card.Suit.SPADE, Card.Rank.KING));
                add(Card.of(Card.Suit.SPADE, Card.Rank.JACK));
            }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.ROYAL_FLUSH, cardPattern);
    }
    @Test
    public void shouldReturnStraightFlush_GivenStraightFlushCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TWO));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FIVE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.THREE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.STRAIGHT_FLUSH, cardPattern);
    }
    @Test
    public void shouldReturnFourOfKind_GivenFourOfKindCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
            add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.ACE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.FOUR_OF_A_KIND, cardPattern);
    }

    @Test
    public void shouldReturnThreeOfKind_GivenThreeOfKindCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
            add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.TWO));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.THREE_OF_A_KIND, cardPattern);
    }

    @Test
    public void shouldReturnFullHouse_GivenFullHouseCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
            add(Card.of(Card.Suit.HEART, Card.Rank.ACE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.ACE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.FOUR));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.FULL_HOUSE, cardPattern);
    }

    @Test
    public void shouldReturnStraight_GivenStraightCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
            add(Card.of(Card.Suit.HEART, Card.Rank.TWO));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FIVE));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.THREE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FOUR));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.STRAIGHT, cardPattern);
    }
    @Test
    public void shouldReturnFlush_GivenFlushCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
            add(Card.of(Card.Suit.SPADE, Card.Rank.KING));
            add(Card.of(Card.Suit.SPADE, Card.Rank.FIVE));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.FLUSH, cardPattern);
    }
    @Test
    public void shouldReturnTwoPair_GivenTwoPairCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
            add(Card.of(Card.Suit.SPADE, Card.Rank.KING));
            add(Card.of(Card.Suit.HEART, Card.Rank.SIX));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.KING));
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.TWO_PAIR, cardPattern);
    }

    @Test
    public void shouldReturnOnePair_GivenOnePairCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
            add(Card.of(Card.Suit.SPADE, Card.Rank.KING));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.SIX));
            add(Card.of(Card.Suit.SPADE, Card.Rank.TEN));
            add(Card.of(Card.Suit.SPADE, Card.Rank.ACE));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.ONE_PAIR, cardPattern);
    }

    @Test
    public void shouldReturnNoPattern_GivenAnyCards() {
        List<Card> cards = new ArrayList<>() {{
            add(Card.of(Card.Suit.SPADE, Card.Rank.SIX));
            add(Card.of(Card.Suit.HEART, Card.Rank.KING));
            add(Card.of(Card.Suit.DIAMOND, Card.Rank.ACE));
            add(Card.of(Card.Suit.CLUB, Card.Rank.TEN));
            add(Card.of(Card.Suit.CLUB, Card.Rank.TWO));
        }};
        PokerCardPatternDetectRequest pokerCardPatternDetectRequest =
                new PokerCardPatternDetectRequest(cards);
        PokerCardPattern cardPattern = pokerCardPatternDetectRequest.getCardPatternResponse();

        assertEquals(PokerCardPattern.NO_PATTERN, cardPattern);
    }
}