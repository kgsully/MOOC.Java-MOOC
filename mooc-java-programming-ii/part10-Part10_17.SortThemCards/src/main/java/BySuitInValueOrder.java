
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card c1, Card c2) {

        if(c1.getSuit() == c2.getSuit()) {
            return c1.getValue() - c2.getValue();
        }
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();

        // From solution ->
        // return c1.getSuit().compareTo(c2.getSuit());

    }
}
