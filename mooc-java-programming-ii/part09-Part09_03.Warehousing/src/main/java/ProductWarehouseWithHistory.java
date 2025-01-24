

public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();

        addToWarehouse(initialBalance);

        // Don't need this anymore as the overriden method adds to the history
        // this.history.add(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        // need to use the 'super' in the overriden method
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        this.history.add(getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());

    }

}
