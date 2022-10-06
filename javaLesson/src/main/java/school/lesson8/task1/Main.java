package school.lesson8.task1;

public class Main {
    public static void main(String[] args) {
        ArrElementCounter arrElementCounter = new ArrElementCounter();
        String[] fruits = new String[]{"Яблоко", "Арбуз", "Вишня", "Гранат", "Ананас", "Гранат", "Ананас", "Слива", "Груша",
                                       "Апельсин", "Арбуз", "Гранат", "Слива", "Гранат", "Персик", "Ананас"};

        arrElementCounter.printUniqueWords(fruits);
        System.out.println();

        arrElementCounter.printCountOfWords(fruits);
    }
}
