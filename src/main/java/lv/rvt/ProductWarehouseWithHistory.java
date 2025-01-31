package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.balance = initialBalance;
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }

    @Override
    public void takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        history.add(getBalance());
    }

    public String history() {
        return history.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + productName + "\nHistory: " + history() + "\nLargest amount of product: " + history.maxValue() + "\nSmallest amount of product: "  + history.minValue() + "\nAverage amount: " + history.average());
    }
}
