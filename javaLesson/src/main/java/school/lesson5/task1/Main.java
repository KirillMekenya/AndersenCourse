package school.lesson5.task1;

public class Main {
    public static void main(String[] args) {
        ChangeArrayItems<Integer> integerChangeArrayItems = new ChangeArrayItems<>(new Integer[]{1, 2, 3, 4, 5});
        ChangeArrayItems<String> stringChangeArrayItems = new ChangeArrayItems<>(new String[]{"first",
                "second", "third", "fourth", "fifth"});
        ChangeArrayItems<Double> doubleChangeArrayItems = new ChangeArrayItems<>(new Double[]{1.1, 2.2,
                3.3, 4.4, 5.5});
        ChangeArrayItems<Car> carChangeArrayItems = new ChangeArrayItems<>(new Car[]{new Car("Honda", 222),
                new Car("Subaru", 180), new Car("Chevrolet", 200),
                new Car("Audi", 190)});

        System.out.println(integerChangeArrayItems);
        System.out.println(integerChangeArrayItems.changeArrayItems(0, 3));
        System.out.println();

        System.out.println(stringChangeArrayItems);
        System.out.println(stringChangeArrayItems.changeArrayItems(1, 2));
        System.out.println();

        System.out.println(doubleChangeArrayItems);
        System.out.println(doubleChangeArrayItems.changeArrayItems(3, 4));
        System.out.println();

        System.out.println(carChangeArrayItems);
        System.out.println(carChangeArrayItems.changeArrayItems(1, 3));
        System.out.println();

        System.out.println(integerChangeArrayItems);
        System.out.println(integerChangeArrayItems.changeArrayItems(1, 5));
    }
}
