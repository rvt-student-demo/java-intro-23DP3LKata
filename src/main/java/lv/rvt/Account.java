package lv.rvt;
import java.util.*;

public class Account {
    private String name;
    private Double balance;

    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.name + " balance: " + this.balance;
    }
}
