package lv.rvt;

import java.util.ArrayList;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int number = scanner.nextInt();
            list.add(number);
            if (number == -1){
                break;
            }
        }
        for (int i = 0; i < list.size() - 1; i++){
            System.out.println(list.get(i));
        }
    }       
}   