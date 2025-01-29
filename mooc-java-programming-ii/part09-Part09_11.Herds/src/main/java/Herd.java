
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable member : this.herd) {
            member.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String herdLocations = "";
        for (Movable member : this.herd) {
            herdLocations += member + "\n";
        }

        return herdLocations;
    }
}
