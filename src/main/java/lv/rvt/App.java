package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Repeating, breaking and remembering (5 parts)
        System.out.println("Give numbers:");

        // int number;
        int sum = 0; int numbers = 0; int even = 0; int odd = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + numbers);
                System.out.println("Average: " + Double.valueOf(sum)/numbers);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
            sum += number; numbers++;
            if (number % 2 == 0) {
                even++;
            } else if (number % 2 != 0) {
                odd++;
            }
        
        }
    }
}
