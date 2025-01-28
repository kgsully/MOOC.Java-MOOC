
import java.util.ArrayList;

public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> contents;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }

    public double weight() {
        double weight = 0.0;
        for (Packable item : contents) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        double weight = this.weight();
        if (weight + item.weight() <= this.maxWeight) {
            contents.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.contents.size() + " items, total weight " + this.weight() + " kg";
    }


}
