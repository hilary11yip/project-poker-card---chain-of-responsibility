package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;
import CardGame.PatternDetector.PatternDetector;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

public abstract class PokerCardPatternDetector implements PatternDetector {
    @Override
    public abstract boolean isMatch();

    @Override
    public abstract PokerCardPattern getCardPattern();

    public static boolean isStraight(Map<Card.Rank, Integer> rankMap, int minStraightCount) {
        final Card.Rank[] SMALLEST_STRAIGHT_RANKS = {Card.Rank.ACE, Card.Rank.TWO, Card.Rank.THREE, Card.Rank.FOUR, Card.Rank.FIVE};

        if (rankMap.keySet().containsAll(Arrays.asList(SMALLEST_STRAIGHT_RANKS))) {
            return true;
        }

        int[] sortedRankValues = rankMap.keySet()
                .stream()
                .mapToInt(Card.Rank::getValue)
                .sorted()
                .toArray();

        return IntStream.range(1, sortedRankValues.length)
                .allMatch(i -> sortedRankValues[i] == sortedRankValues[i - 1] + 1);
    }

    public static boolean isFlush(Map<Card.Suit, Integer> suitMap, int minFlushCount) {
        return suitMap.keySet()
                .stream()
                .filter(key -> suitMap.get(key) >= minFlushCount)
                .count() > 0;
    }

    public static boolean isRoyal(Map<Card.Rank, Integer> rankMap) {
        Card.Rank[] desiredRanks = {Card.Rank.ACE, Card.Rank.KING, Card.Rank.QUEEN, Card.Rank.JACK, Card.Rank.TEN};

        return rankMap.keySet().containsAll(Arrays.asList(desiredRanks));
    }

    public static int getNumberOfPairs(Map<Card.Rank, Integer> rankMap) {
        return (int) rankMap.values()
                .stream()
                .filter(value -> value >= 2)
                .count();
    }
}