package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        Stars.printSpaces(1);
        Stars.printTriangle2(4);
        System.out.println();
        Stars.christmasTree(4);
        System.out.println();
        Stars.christmasTree(10);
    }       
}