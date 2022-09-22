package school.lesson4.animals;

public class Cat extends Animal implements Runnable {
    private static final int CAT_RUN_DISTANCE_LIMIT = 200;
    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= CAT_RUN_DISTANCE_LIMIT) {
            System.out.println("Кот " + this.name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот " + this.name + " не может пробежать " + distance + " метров, "
                    + this.name + " может пробежать максимум "+ CAT_RUN_DISTANCE_LIMIT +" метров");
        }
    }
}
