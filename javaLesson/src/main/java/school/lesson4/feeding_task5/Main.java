package school.lesson4.feeding_task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Cat cat = new Cat("Barsik", 5);
        Cat[] cats = new Cat[5];
        Plate plate = new Plate(1);

        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + (i + 1), random.nextInt(10));
            cats[i].getCatInfo();
        }
        System.out.println();
        plate.addFood(20);
        System.out.println();

        for (Cat tempCat : cats) {
            plate.info();
            tempCat.eat(plate);
            tempCat.getCatInfo();
            System.out.println();
        }

        for (Cat cat1 : cats) {
            cat1.getCatInfo();
        }
    }
}
