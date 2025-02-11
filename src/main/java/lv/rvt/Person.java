package lv.rvt;

public class Person{
    
    private String name;
    private int age;
    private int weight;
    private int height;
    private String address;



    public Person(String name) {
        this(name, 0, 0, 0);
    }
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }



    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getHeight() {
        return this.height;
    }



    public void growOlder() {
        this.age = this.age + 1;
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }



    @Override
    public String toString() {
        if (this.address != null) {
            return this.name + "\n  " + this.address;
        }
        return this.name + ", age " + this.age + " years";
    }
}
