package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.Map;

public class TwoPairDetector extends PokerCardPatternDetector {
    private Map<Card.Rank, Integer> rankMap;

    TwoPairDetector(Map<Card.Rank, Integer> rankMap){
        this.rankMap = rankMap;
    }

    @Override
    public boolean isMatch() {
        return PokerCardPatternDetector.getNumberOfPairs(rankMap) >= 2;
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.TWO_PAIR;
    }
}