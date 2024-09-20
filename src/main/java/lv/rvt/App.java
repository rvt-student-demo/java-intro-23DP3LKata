package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // 1 stunda
        
        // String input1 = scanner.nextLine();
        // System.out.println("Sveiks " + input1 + "!");

        // String name = "John";
        // int age = 20;
        // boolean isOnline = true;
        // System.out.println(name);


        // 2 stunda

        // System.out.println("Ievadi savu vārdu: ");
        // String name = scanner.nextLine();

        // System.out.println("Ievadi savu uzvārdu: ");
        // String lastname = scanner.nextLine();
        
        // System.out.println("Ievadi savu grupu: ");
        // String group = scanner.nextLine();

        // System.out.println("Students: " + name + " " + lastname + ", grupa: " + group);


        // 3 stunda

        // System.out.println("Print a value: ");
        // int value = Integer.valueOf(scanner.nextLine());
        // System.out.println("You wrote " + value);



        // 1 part: Conditional statements and conditional operation 
        // Speeding Ticket

        // System.out.println("Give speed:");
        // int input1 = scanner.nextInt();   // int input1 = Integer.valueOf(scanner.nextLine());
        // if (input1 > 120) {
        //     System.out.println("Speeding ticket!");
        // }


        // Grades and Points

        System.out.println("Give points [0-100]:");
        int input = scanner.nextInt();
        if (input < 0) {
            System.out.println("Grade: impossible!");
        }
        else if (0 < input && input <= 49) {
            System.out.println("Grade: failed");
        }
        else if (50 <= input && input <= 59) {
            System.out.println("Grade: 1");
        }
        else if (60 <= input && input <= 69) {
            System.out.println("Grade: 2");
        }
        else if (70 <= input && input <= 79) {
            System.out.println("Grade: 3");
        }
        else if (80 <= input && input <= 89) {
            System.out.println("Grade: 4");
        }
        else if (90 <= input && input <= 100) {
            System.out.println("Grade: 5");
        }
        else if (input > 100) {
            System.out.println("Grade: incredible!");
        }
    }

}
