package lv.rvt;

public class App 
{
    public static void main( String[] args )
    {

        // Your first bank transfer
        
        Account acc1 = new Account("Matthews account", 1000.0);
        Account acc2 = new Account("My account", 0.0);

        acc1.withdraw(100.0);
        acc2.deposit(100.0);

        System.out.println(acc1);
        System.out.println(acc2);

    }
}   