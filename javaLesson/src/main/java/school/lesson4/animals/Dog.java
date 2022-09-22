package school.lesson4.animals;

public class Dog extends Animal implements Swimmable, Runnable {
    private static final int DOG_RUN_DISTANCE_LIMIT = 500;
    private static final int DOG_SWIM_DISTANCE_LIMIT = 10;
    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= DOG_RUN_DISTANCE_LIMIT) {
            System.out.println("Пёс " + this.name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Пёс " + this.name + " не может пробежать " + distance + " метров, "
                    + this.name + " может пробежать максимум " + DOG_RUN_DISTANCE_LIMIT + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= DOG_SWIM_DISTANCE_LIMIT) {
            System.out.println("Пёс " + this.name + " проплыл " + distance + " метров.");
        } else {
            System.out.println("Пёс " + this.name + " не может проплыть " + distance + " метров, "
                    + this.name + " может проплыть максимум " + DOG_SWIM_DISTANCE_LIMIT + " метров");
        }
    }
}
