package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        // String input1 = scanner.nextLine();
        // System.out.println("Sveiks " + input1 + "!");

        // String name = "John";
        // int age = 20;
        // boolean isOnline = true;
        // System.out.println(name);

        System.out.println("Ievadi savu vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadi savu uzvārdu: ");
        String lastname = scanner.nextLine();
        
        System.out.println("Ievadi savu grupu: ");
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + lastname + ", grupa: " + group);
    }

}
