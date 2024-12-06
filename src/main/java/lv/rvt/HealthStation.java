package lv.rvt;

public class HealthStation {
    
    private int manyWeighings;
    public int weigh(Person person) {
        this.manyWeighings += 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);;
    }

    public int weighings() {
        return this.manyWeighings;
    }

}
