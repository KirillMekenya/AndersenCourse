package school.lesson1;

import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.println("a = "+a+", b = "+b);
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        Random random = new Random();
        int value = random.nextInt(200);
        System.out.println("value = "+value);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.println("a = "+a+", b = "+b);
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}
