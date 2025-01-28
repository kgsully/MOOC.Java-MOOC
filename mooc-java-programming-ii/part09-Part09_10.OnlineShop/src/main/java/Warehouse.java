
import java.util.HashMap;
import java.util.Map;
import java.util.Set;;

public class Warehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        if (this.productPrices.containsKey(product) || this.productStock.containsKey(product)) {
            return;
        }
        this.productPrices.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        return this.productPrices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.productStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int qtyRemaining = this.productStock.getOrDefault(product, -99);
        if (qtyRemaining > 0) {
            this.productStock.put(product, qtyRemaining - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return this.productPrices.keySet();
    }

}
