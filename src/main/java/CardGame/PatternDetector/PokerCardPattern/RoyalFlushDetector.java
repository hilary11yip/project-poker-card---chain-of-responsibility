package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.Map;

public class RoyalFlushDetector extends PokerCardPatternDetector {
    private Map<Card.Suit, Integer> suitMap;
    private Map<Card.Rank, Integer> rankMap;

    RoyalFlushDetector(Map<Card.Suit, Integer> suitMap, Map<Card.Rank, Integer> rankMap){
        this.suitMap = suitMap;
        this.rankMap = rankMap;
    }

    @Override
    public boolean isMatch() {
        return isRoyal(rankMap) && isFlush(suitMap, 5);
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.ROYAL_FLUSH;
    }
}