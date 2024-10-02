package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        System.out.println("How many times?");
        int number = Integer.valueOf(scanner.nextLine());
        while (i <= number){
            printText();
            i += 1;
        }
    }
    public static void printText() 
    {
        System.out.println("In a hole in the ground there lived a method");
    }
}