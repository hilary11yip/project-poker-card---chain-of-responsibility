package CardGame.PatternDetector;

import CardGame.PatternDetector.PokerCardPattern.PokerCardPattern;

public interface PatternDetector {
    boolean isMatch();
    PokerCardPattern getCardPattern();
}
