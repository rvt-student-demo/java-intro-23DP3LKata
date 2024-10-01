package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Number and sum of numbers
        // Integer numbers = 0;
        // Integer summ = 0;

        // while (true) {
        //     System.out.println("Give a number:");
        //     int number = Integer.valueOf(scanner.nextLine());
        //     if (number == 0) {
        //         System.out.println("Number of numbers:" + numbers);
        //         System.out.println("Sum of the numbers:" + summ);
        //         break;
        //     }
        //     numbers += 1;
        //     summ = number + summ;
        // }

        // Counting
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < number + 1; i++) {
            System.out.println(i);
        }
    }
}
