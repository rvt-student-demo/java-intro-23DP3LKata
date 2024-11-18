package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // Cubes
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int input2 = Integer.valueOf(input);
            System.out.println(input2 * input2 * input2);
        }

        scanner.close();
    }
}