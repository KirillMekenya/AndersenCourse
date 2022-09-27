package school.lesson5.task2_fruits;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox1 = new Box<>(new ArrayList<>());
        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());

        Main.addAmountOfAppleToBox(1, appleBox);
        Main.addAmountOfAppleToBox(3, appleBox1);
        Main.addAmountOfOrangeToBox(20, orangeBox);
        Main.addAmountOfOrangeToBox(2, orangeBox1);

        System.out.println("Вес коробки с яблоками " + appleBox.getBoxWeight());
        System.out.println("Вес коробки с апельсинами " + orangeBox.getBoxWeight());
        System.out.println();

        System.out.println("Вес коробки с яблоками после добавления одного фрукта "
                + appleBox.addFruitsToBox(new Apple()).getBoxWeight());
        System.out.println("Вес коробки с апельсинами после добавления одного фрукта "
                + orangeBox.addFruitsToBox(new Orange()).getBoxWeight());
        System.out.println();

        System.out.println("Сравнение веса коробок с яблоками " + appleBox.getBoxWeight()
                + " и апельсинами " + orangeBox.getBoxWeight() + ": " + appleBox.compareWeightWithBox(orangeBox));
        System.out.println("Сравнение одинаковых по весу коробок с яблоками " + appleBox1.getBoxWeight()
                + " и апельсинами " + orangeBox1.getBoxWeight() + ": " + appleBox1.compareWeightWithBox(orangeBox1));
        System.out.println();

        System.out.println("Исходные коробки");
        System.out.println(appleBox.getFruits().toString());
        System.out.println(appleBox1.getFruits().toString());
        System.out.println();

        System.out.println("Коробки после перемещения фруктов:");
        appleBox.moveFruitsToBox(appleBox1);
        System.out.println(appleBox.getFruits().toString());
        System.out.println(appleBox1.getFruits().toString());

        //Аналогично работает и для апельсинов.
        orangeBox1.moveFruitsToBox(orangeBox);

        //В случае если тип коробок будет разный, будет ошибка компиляции
        //orangeBox1.moveFruitsToBox(appleBox);
    }

    public static void addAmountOfAppleToBox(int amount, Box<Apple> box) {
        for (int i = 0; i < amount; i++) {
            box.addFruitsToBox(new Apple());
        }
    }

    public static void addAmountOfOrangeToBox(int amount, Box<Orange> box) {
        for (int i = 0; i < amount; i++) {
            box.addFruitsToBox(new Orange());
        }
    }
}

