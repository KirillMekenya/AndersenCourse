package school.lesson5.task1;

public class Car {
    private final String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return model+" speed: "+speed;
    }
}
