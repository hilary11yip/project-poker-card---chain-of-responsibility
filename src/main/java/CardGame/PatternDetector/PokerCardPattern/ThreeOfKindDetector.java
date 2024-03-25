package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.Map;

public class ThreeOfKindDetector extends PokerCardPatternDetector {
    private Map<Card.Rank, Integer> rankMap;

    ThreeOfKindDetector(Map<Card.Rank, Integer> rankMap){
        this.rankMap = rankMap;
    }

    @Override
    public boolean isMatch() {
        return rankMap.values().contains(3);
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.THREE_OF_A_KIND;
    }
}