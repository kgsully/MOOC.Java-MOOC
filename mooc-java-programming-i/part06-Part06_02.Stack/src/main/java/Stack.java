
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.values.size() == 0;
    }

    public void add(String value) {
        this.values.add(value);
    }

    public String take() {
        return this.values.remove(this.values.size() - 1);
    }

    public ArrayList<String> values() {
        return this.values;
    }

}
