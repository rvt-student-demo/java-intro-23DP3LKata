package lv.rvt;
import java.util.*;

public class Stars{
    Scanner scanner = new Scanner(System.in);

    public static void printStars(int stars){
        for (int i = 0; i < stars; i++){
            System.out.print("*");
        
        }
        System.out.println("");
    }
    
    public static void printSquare(int size){
        printStars(4);
        printStars(4);
        printStars(4);
        printStars(4);
    }
    public static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++){
            System.out.println("");
            for (int j = 0; j < width; j++){
                System.out.print("*");
            }
        }
        System.out.println("");
    }
    public static void printTriangle(int size){
        for (int i = 0; i <= size; i++){
            for(int j = 0; j < i; j++)
            System.out.print("*");
            System.out.println();
        }
        
    }
}