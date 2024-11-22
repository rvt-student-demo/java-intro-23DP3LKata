package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // Overloaded Counter (2 parts)

        Counter counter = new Counter(5);
        System.out.println(counter.value());
        counter.increase();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
        counter.increase(5);
        System.out.println(counter.value());
        counter.decrease(6);
        System.out.println(counter.value());
        counter.decrease(10);
        System.out.println(counter.value());
    }
}