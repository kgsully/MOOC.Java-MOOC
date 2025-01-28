public class Item {

    private String product;
    private int qty;
    private int unitPrice;


    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public int price() {
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity() {
        this.qty += 1;
    }

    public void reduceQuantity() {
        if (this.qty - 1 >= 0) {
            this.qty -= 1;
        }
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }



}
