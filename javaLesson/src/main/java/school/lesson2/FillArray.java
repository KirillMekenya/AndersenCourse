package school.lesson2;

public class FillArray {
    public void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] = i + 1) + " ");
        }
    }
}
