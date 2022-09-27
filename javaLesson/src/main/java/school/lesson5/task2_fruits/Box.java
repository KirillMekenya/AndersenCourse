package school.lesson5.task2_fruits;

import java.util.ArrayList;
import java.util.Iterator;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public Box<T> addFruitsToBox(T fruit) {
        fruits.add(fruit);
        return this;
    }

    public float getBoxWeight() {
        if (!fruits.isEmpty()) {
            Iterator<T> iterator = fruits.iterator();
            return fruits.size() * iterator.next().getWeight();
        } else return 0;
    }

    public boolean compareWeightWithBox(Box<?> box) {
        return box.getBoxWeight() == this.getBoxWeight();
    }

    public void moveFruitsToBox (Box<T> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
