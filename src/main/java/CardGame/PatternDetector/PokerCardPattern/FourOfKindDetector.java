package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.*;

public class FourOfKindDetector extends PokerCardPatternDetector {
    private Map<Card.Rank, Integer> rankMap;

    FourOfKindDetector(Map<Card.Rank, Integer> rankMap){
        this.rankMap = rankMap;
    }

    @Override
    public boolean isMatch() {
        return rankMap.values().contains(4);
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.FOUR_OF_A_KIND;
    }
}