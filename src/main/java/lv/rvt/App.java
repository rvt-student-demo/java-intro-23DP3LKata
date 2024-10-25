package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Index of

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int number = scanner.nextInt();
            list.add(number);
            if (number == -1){
                break;
            }
        }
        System.out.println();
        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextInt());

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == search){
                System.out.println(search + " is at index " + i);
            } else if(list.get(i) != search){
                continue;
            }
        }
    }
}   