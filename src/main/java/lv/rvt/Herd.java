package lv.rvt;

import java.util.ArrayList;
import java.util.List;

    // ai!

class Herd implements Movable {
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        return String.join("\n", herd.stream().map(Object::toString).toList());
    }
}