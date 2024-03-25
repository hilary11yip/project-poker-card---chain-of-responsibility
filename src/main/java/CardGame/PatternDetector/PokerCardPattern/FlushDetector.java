package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;

import java.util.Map;

public class FlushDetector extends PokerCardPatternDetector {
    private Map<Card.Suit, Integer> suitMap;

    FlushDetector(Map<Card.Suit, Integer> suitMap){
        this.suitMap = suitMap;
    }

    @Override
    public boolean isMatch() {
        return isFlush(suitMap, 5);
    }

    @Override
    public PokerCardPattern getCardPattern() {
        return PokerCardPattern.FLUSH;
    }
}