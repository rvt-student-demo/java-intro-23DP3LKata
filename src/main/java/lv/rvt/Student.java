package lv.rvt;

public class Student extends Person {

    private int StCredits;

    public Student(String name, String address) {
        super(name, address);
        this.StCredits = 0;
    }


    public void study() {
        this.StCredits += 1;
    }
    public int credits() {
        return this.StCredits;
    }


    @Override
    public String toString() {
        return super.toString() +  "\n  Study credits: " + this.StCredits;
    }
}