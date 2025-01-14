package lv.rvt;

public class Box {

    public double width;
    public double height;
    public double length;


    public Box(double width, double height, double length ) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }



    public double length() {
        return this.length;
    }
    public double height() {
        return this.height;
    }
    public double width() {
        return this.width;
    }



    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.width, 1.25 * oldBox.height, 1.25 * oldBox.length);
    }

    public Box smallBox(Box oldBox) {
        return new Box(0.75 * oldBox.width, 0.75 * oldBox.height, 0.75 * oldBox.length);
    }
    

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double volume() {
        return this.width * this.height * this.length;
    }

    private double topArea() {
        return this.width * this.length;
    }
    private double faceArea() {
        return this.width * this.height;
    }
    private double sideArea() {
        return this.length * this.height;
    }
}
