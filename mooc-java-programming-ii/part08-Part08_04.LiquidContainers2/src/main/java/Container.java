public class Container {
    private static final int MIN_CONTENTS = 0;
    private static final int MAX_CONTENTS = 100;

    private int contents;

    public Container() {
        this.contents = 0;
    }

    public int contains() {
        return contents;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.contents = (this.contents + amount <= MAX_CONTENTS) ? (this.contents + amount) : 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.contents = (this.contents - amount >= MIN_CONTENTS) ? (this.contents - amount) : 0;
        }
    }

    @Override
    public String toString() {
        return this.contents + "/100";
    }
}
