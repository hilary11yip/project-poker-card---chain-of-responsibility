package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.Map;

public class StraightFlushDetector extends PokerCardPatternDetector {
    private Map<Card.Suit, Integer> suitMap;
    private Map<Card.Rank, Integer> rankMap;

    StraightFlushDetector(Map<Card.Suit, Integer> suitMap, Map<Card.Rank, Integer> rankMap){
        this.suitMap = suitMap;
        this.rankMap = rankMap;
    }

    @Override
    public boolean isMatch() {
        return isStraight(rankMap, 5) && isFlush(suitMap, 5);
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.STRAIGHT_FLUSH;
    }
}