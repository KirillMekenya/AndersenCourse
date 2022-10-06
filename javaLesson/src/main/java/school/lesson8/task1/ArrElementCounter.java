package school.lesson8.task1;

import java.util.*;

public class ArrElementCounter {

    public void printUniqueWords(String[] array) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(array));
        System.out.println("Список уникальных фруктов");
        System.out.println(set);
    }

    public void printCountOfWords(String[] array) {
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(array));
        Set<String> set = new LinkedHashSet<>(Arrays.asList(array));
        System.out.println("Список слов с количеством повторений");
        for (String word : set) {
            System.out.println(word + " : " + Collections.frequency(wordsList, word));
        }
    }
}
