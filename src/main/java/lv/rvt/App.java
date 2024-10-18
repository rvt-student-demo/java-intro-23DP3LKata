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
        
        int largest = 0;
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if (largest < number){
                largest = number;
            }
        }   
        System.out.println();
        System.out.println("The greatest number: " + largest);
        
    }       
}   