package lv.rvt;

public class Warehouse {

    public double balance;
    private double capacity;


    public Warehouse(double capacity) {
        this.capacity = (capacity > 0) ? capacity : 0;
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            if (this.balance + amount > this.capacity) {
                this.balance = this.capacity;
            } else {
                this.balance += amount;
            }
        }
    }

    public void takeFromWarehouse(double amount) {
        if (amount > 0) {
            if (this.balance - amount > this.capacity) {
                this.balance = this.capacity;
            } else {
                this.balance -= amount;
            }
        }
    }

    public String toString() {
        return ("balance =  " + this.balance + ", space left " + howMuchSpaceLeft());
    }
}
