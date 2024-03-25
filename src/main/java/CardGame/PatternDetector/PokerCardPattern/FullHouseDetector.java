package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.Map;

public class FullHouseDetector extends PokerCardPatternDetector {
    private Map<Card.Rank, Integer> rankMap;

    FullHouseDetector(Map<Card.Rank, Integer> rankMap){
        this.rankMap = rankMap;
    }

    @Override
    public boolean isMatch() {
        return rankMap.values().contains(3) && rankMap.values().contains(2);
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.FULL_HOUSE;
    }
}