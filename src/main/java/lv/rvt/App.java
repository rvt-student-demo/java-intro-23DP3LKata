package lv.rvt;



public class App 
{
    public static void main ( String[] args )

    {
        Box box = new Box(1, 1, 1);
  
        System.out.println("height: " + box.height + " width: " + box.width + " length: " + box.length);
        
        System.out.println("Area: " + box.area() + " volume: " + box.volume());
          
        System.out.println("Small box: " + box.smallBox(box).volume());
        System.out.println("Big box: " + box.biggerBox(box).volume());
    }
}
  