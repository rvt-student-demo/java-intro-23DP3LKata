package lv.rvt;

public class ProductWarehouse extends Warehouse{
    public String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String toString() {
        return (this.productName + ": balance = " + balance + ", space left " + howMuchSpaceLeft());
    }
}
