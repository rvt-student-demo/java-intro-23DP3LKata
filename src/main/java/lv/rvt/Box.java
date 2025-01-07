package lv.rvt;

public class Box {

    public double width;
    public double height;
    public double length;

    Box ( double width, double height, double length ) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double area() {
        return width * height;
    }

    public double volume() {
        return width * height * length;
    }
}
