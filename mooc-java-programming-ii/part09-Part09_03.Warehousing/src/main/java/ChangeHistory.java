
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double max = this.history.get(0);
        for (int i = 1; i < this.history.size(); i++) {
            double value = this.history.get(i);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        double min = this.history.get(0);
        for (int i = 1; i < this.history.size(); i++) {
            double value = this.history.get(i);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (double value : this.history) {
            sum += value;
        }
        return sum / this.history.size();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

}
