import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Item item : items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item returnItem = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > returnItem.getWeight()) {
                returnItem = item;
            }
        }
        return returnItem;
    }

    @Override
    public String toString() {
        int itemQty = this.items.size();
        if (itemQty == 0) {
            return "no items (0 kg)";
        }

        String returnString = itemQty + " ";
        if (itemQty == 1) {
            returnString += "item";
        } else {
            returnString += "items";
        }
        returnString += " (" + totalWeight() + " kg)";

        return returnString;

    }

}
