package school.lesson5.task2_fruits;

public abstract class Fruit {

    protected float weight;

    protected Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " вес " + this.weight;
    }
}
