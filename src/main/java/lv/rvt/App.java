package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Only these numbers

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int number = scanner.nextInt();
            list.add(number);
            if (number == -1){
                break;
            }
        }

        System.out.print("From where? ");
        int from = Integer.valueOf(scanner.nextInt());
        System.out.print("To where? ");
        int to = Integer.valueOf(scanner.nextInt());

        for (from = from; from <= to; from++){
            System.out.println(list.get(from));
        }
    }
}   