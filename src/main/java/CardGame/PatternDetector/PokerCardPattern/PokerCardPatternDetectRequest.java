package CardGame.PatternDetector.PokerCardPattern;

import CardGame.Card.Card;
import CardGame.PatternDetector.CardPatternDetectRequest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokerCardPatternDetectRequest implements CardPatternDetectRequest {
    private Map<Card.Suit, Integer> suitMap;
    private Map<Card.Rank, Integer> rankMap;

    public PokerCardPatternDetectRequest(List<Card> cards){
        this.suitMap = getSuitMap(cards);
        this.rankMap = getRankMap(cards);
    }
    private Map<Card.Suit, Integer> getSuitMap(List<Card> cards) {
        Map<Card.Suit, Integer> suitMap = cards.stream()
                .collect(Collectors.toMap(Card::getSuit, card -> 1, Integer::sum));

        return suitMap;
    }

    private Map<Card.Rank, Integer> getRankMap(List<Card> cards) {
        Map<Card.Rank, Integer> rankMap = cards.stream()
                .collect(Collectors.toMap(Card::getRank, card -> 1, Integer::sum));

        return rankMap;
    }

    @Override
    public PokerCardPattern getCardPatternResponse(){
        PokerCardPatternDetector[] pokerCardPatternDetectors = {
                new RoyalFlushDetector(suitMap, rankMap),
                new StraightFlushDetector(suitMap, rankMap),
                new FourOfKindDetector(rankMap),
                new FullHouseDetector(rankMap),
                new FlushDetector(suitMap),
                new StraightDetector(rankMap),
                new ThreeOfKindDetector(rankMap),
                new TwoPairDetector(rankMap),
                new OnePairDetector(rankMap)
        };

        for(PokerCardPatternDetector detector:pokerCardPatternDetectors){
            if(detector.isMatch()){
                return detector.getCardPattern();
            }
        }

        return PokerCardPattern.NO_PATTERN;
    }
}
