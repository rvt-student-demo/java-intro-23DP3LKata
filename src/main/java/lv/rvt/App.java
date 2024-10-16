package lv.rvt;

import java.util.ArrayList;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            list.add(number);
            if(number == 0){
                break;
            }
        }
        sum = (list.get(1) + list.get(2));
        System.out.println(list);   
        System.out.println(sum);
    }       
}