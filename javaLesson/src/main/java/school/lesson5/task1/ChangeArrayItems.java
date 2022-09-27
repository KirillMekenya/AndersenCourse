package school.lesson5.task1;

import java.util.Arrays;

public class ChangeArrayItems<T> {

    private T[] array;

    public ChangeArrayItems(T[] array) {
        this.array = array;
    }

    public ChangeArrayItems<T> changeArrayItems(int index1, int index2) {
        if (index1 < array.length && index2 < array.length && index1 >= 0 && index2 >= 0) {
            System.out.println("Элемент " + array[index1] + " меняется местами с " + array[index2]);
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Один или все элементы указанных индекcов в массиве не существуют");
        }
        return this;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
