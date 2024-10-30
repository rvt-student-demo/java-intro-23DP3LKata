package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // AV Club

        while(true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            } 
            
            String[] split = text.split(" ");
            for (String word : split){
                if (word.contains("av")){
                    System.out.println(word);
                }
            }
        }
    }
}   