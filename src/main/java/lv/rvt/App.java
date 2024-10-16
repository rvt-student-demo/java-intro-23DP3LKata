package lv.rvt;

import java.util.ArrayList;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while(true){
            String name = (scanner.nextLine());
            list.add(name);
            if(name.equals("")){
                break;
            }
        }
        int last = list.size() - 2;
        System.out.println(list.get(last));
    }       
}