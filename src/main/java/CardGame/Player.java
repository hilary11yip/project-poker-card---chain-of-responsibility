package CardGame;

import java.util.List;
import java.util.Objects;

public class Player {
    private int id;
    private String name;
    private List cards;
    private float money;
    private int score;

    public Player(int id, String name, List cards, float money, int score){
        this.id = id;
        this.name = name;
        this.cards = cards;
        this.money = money;
        this.score = score;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getMoney() {
        return money;
    }
    public void setMoney(float money) {
        this.money = money;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public List getCards() {
        return cards;
    }
    public void setCards(List cards) {
        this.cards = cards;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "{\"id\"=\"" + id
                + "\", \"name\"=" + name
                + "\", \"money\"=" + money
                + "\", \"score\"=" + score
                + "\", \"cards\"=" + cards
                + "\"}";
    }
}
