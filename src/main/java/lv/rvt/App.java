package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Personal details


        String lname = ""; int count = 0; int sumYear = 0;

        while(true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            }

            String[] split = text.split(",");
            String name = split[0];
            int year = Integer.parseInt(split[1]);

            if (name.length() > lname.length()){
                lname = name;
            }

            sumYear += year;
            count++;
            
        }
        double avgyear = (double) sumYear / count;
        System.out.println("Longest name: " + lname);
        System.out.println("Average of the birth years: " + avgyear);  
    }
}   