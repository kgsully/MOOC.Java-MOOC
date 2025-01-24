

public class OneItemBox extends Box{

    private Item item;

    public OneItemBox() {

    }

    @Override
    public void add(Item item) {
        if (this.item != null) {
            return;
        }
        this.item = item;

    }

    @Override
    public boolean isInBox(Item item) {
        if (this.item != null && this.item.equals(item)) {
            return true;
        }
        return false;
    }

}
