package school.lesson2;

public class ArrayParamReturn {
    public int[] returnArrayWithParams (int initialValue, int len) {
        int[] array = new int[len];
        for (int a:
             array) {
            a = initialValue;
            System.out.print(a+" ");
        }
        return array;
    }
}
