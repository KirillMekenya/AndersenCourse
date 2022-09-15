package school.lesson2;

public class ArrayParamReturn {
    public int[] returnArrayWithParams(int initialValue, int len) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
