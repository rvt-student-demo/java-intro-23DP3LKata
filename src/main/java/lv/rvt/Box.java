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

    double area() {
        return 2 * faceArea() + 2 * topArea() + 2 *sideArea() ;
    }

    double volume() {
        return width * height * length;
    }

    double topArea() {
        return width * length;
    }
    double faceArea() {
        return width * height;
    }
    double sideArea() {
        return length * height;
    }
}
