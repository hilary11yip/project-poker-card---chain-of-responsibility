package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.Map;

public class StraightDetector extends PokerCardPatternDetector {
    private Map<Card.Rank, Integer> rankMap;

    StraightDetector(Map<Card.Rank, Integer> rankMap){
        this.rankMap = rankMap;
    }

    @Override
    public boolean isMatch() {
        return isStraight(rankMap, 5);
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.STRAIGHT;
    }
}