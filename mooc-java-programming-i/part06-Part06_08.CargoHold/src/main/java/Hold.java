import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> contents;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }

    public void addSuitcase (Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            contents.add(suitcase);
        }
    }

    public int totalWeight() {
        if (contents.isEmpty()) {
            return 0;
        }

        int currentWeight = 0;
        for (Suitcase item : contents) {
            currentWeight += item.totalWeight();
        }

        return currentWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : contents) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (this.contents.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.contents.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.contents.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
