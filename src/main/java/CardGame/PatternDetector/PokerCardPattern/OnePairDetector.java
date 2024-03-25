package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.Map;

public class OnePairDetector extends PokerCardPatternDetector {
    private Map<Card.Rank, Integer> rankMap;

    OnePairDetector(Map<Card.Rank, Integer> rankMap){
        this.rankMap = rankMap;
    }

    @Override
    public boolean isMatch() {
        return PokerCardPatternDetector.getNumberOfPairs(rankMap) == 1;
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.ONE_PAIR;
    }
}