package lv.rvt;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;
    private int weight;
    private String location;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

    public Product(String name){
        this.name = name;
        this.weight = 1;
        this.location = "shelf";
        System.out.println(this.name + " (" + this.weight + " kg)" + " can be found from the " + this.location);
    }

    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
        System.out.println(this.name + " (" + this.weight + " kg)" + " can be found from the " + this.location);
    }

    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.location = "shelf";
        System.out.println(this.name + " (" + this.weight + " kg)" + " can be found from the " + this.location);
    }
}