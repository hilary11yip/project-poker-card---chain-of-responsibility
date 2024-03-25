package CardGame.PatternDetector.PokerCardPattern;

import CardGame.PatternDetector.CardPattern;

public enum PokerCardPattern implements CardPattern {
    ROYAL_FLUSH,
    STRAIGHT_FLUSH,
    FOUR_OF_A_KIND,
    FULL_HOUSE,
    FLUSH,
    STRAIGHT,
    THREE_OF_A_KIND,
    TWO_PAIR,
    ONE_PAIR,
    NO_PATTERN;
}
