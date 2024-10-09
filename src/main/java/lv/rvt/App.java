package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Star sign (4 parts)
        System.out.println("How many columns?");
        int columns = Integer.valueOf(scanner.nextInt());
        int[] starsInRow = new int[columns];

        for (int i = 1; i <= columns; i++) {
            System.out.println("How many stars are in the " + i + " row?");
            starsInRow[i - 1] = Integer.valueOf(scanner.nextInt());
        }
        System.out.println();
        for (int stars : starsInRow) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}