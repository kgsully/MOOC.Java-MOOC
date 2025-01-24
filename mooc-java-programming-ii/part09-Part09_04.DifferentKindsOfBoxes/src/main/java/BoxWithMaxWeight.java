
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int remainingCapcity = this.capacity;
        for (Item boxItem : this.items) {
            remainingCapcity -= boxItem.getWeight();
        }
        if (item.getWeight() <= remainingCapcity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item boxItem : this.items) {
            if (boxItem.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
