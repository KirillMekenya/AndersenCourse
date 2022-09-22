package school.lesson4.animals;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Cat catVaska = new Cat("Vaska");
        Dog dogBobik = new Dog("Bobik");
        Animal catBarsik = new Cat("Barsik");
        catVaska.run(random.nextInt(300));
        System.out.println();
        dogBobik.run(random.nextInt(700));
        dogBobik.swim(random.nextInt(15));
        System.out.println();
        System.out.println("Количество созданных котов "+Cat.getCatCount());
        System.out.println("Количество созданных собак "+Dog.getDogCount());
    }
}
