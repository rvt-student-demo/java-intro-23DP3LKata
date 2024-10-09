package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Divisible by three
        Scanner scanner = new Scanner(System.in);
        int beginning1 = Integer.valueOf(scanner.nextLine());
        int end1 = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        divisibleByThreeInRange(beginning1, end1);
    }
    public static void divisibleByThreeInRange(int beginning, int end)
    {
        for(int i = beginning; i <= end; i++){
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}