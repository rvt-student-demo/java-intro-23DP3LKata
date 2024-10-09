package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        // From one to parameter
        printUntilNumber(5);
        System.out.println("");
        printUntilNumber(2);
    }
    public static void printUntilNumber(int number){
        int i = 1;
        while(i <= number){
            System.out.println(i++);
        }
    }
}