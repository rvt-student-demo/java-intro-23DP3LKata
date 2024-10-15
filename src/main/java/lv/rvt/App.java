package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Advanced astrology (3 parts)
        Stars.printStars(5);
        Stars.printStars(3);
        Stars.printStars(9);
        System.out.println();
        Stars.printSquare(4);
        System.out.println();
        Stars.printRectangle(17,3);
        System.out.println();
        Stars.printTriangle(4);
    }
}