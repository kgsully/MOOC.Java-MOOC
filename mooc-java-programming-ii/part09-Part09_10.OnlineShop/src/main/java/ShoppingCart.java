
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String product, int price) {
        for (Item item : cart) {
            if (item.getProduct().toLowerCase().equals(product.toLowerCase())) {
                item.increaseQuantity();
                return;
            }
        }

        cart.add(new Item(product, 1, price));
    }

    public int price() {
        int cartPrice = 0;
        for (Item item : cart) {
            cartPrice += item.price();
        }
        return cartPrice;
    }

    public void print() {
        for (Item item : cart) {
            System.out.println(item);
        }
    }

}
