
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream()
            .forEach(card -> {
                System.out.println(card);
            });
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand otherHand) {

        int valueThisHand = this.cards.stream()
            .mapToInt(card -> card.getValue())
            .sum();

        int valueOtherHand = otherHand.getCards().stream()
            .mapToInt(card -> card.getValue())
            .sum();

        return valueThisHand - valueOtherHand;
    }

}
