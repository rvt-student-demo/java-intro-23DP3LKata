package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Line by line

        while(true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            } 
            String[] split = text.split(" ");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }
        }
    }
}   