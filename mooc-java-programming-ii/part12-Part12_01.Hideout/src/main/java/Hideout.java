

public class Hideout<T> {

    private T item;

    public Hideout() {
        this.item = null;
    }

    public void putIntoHideout(T toHide) {
        this.item = toHide;
    }

    public T takeFromHideout() {
        T takenItem = this.item;
        this.item = null;
        return takenItem;
    }

    public boolean isInHideout() {
        if (this.item == null) {
            return false;
        }

        return true;

    }

}
