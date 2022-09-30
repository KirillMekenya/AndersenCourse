package school.lesson6;

import school.lesson6.exceptions.MyArrayDataException;
import school.lesson6.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        Array4x4 array4x4 = new Array4x4();
        String[][] arrayNotCorrect = new String[][]{{"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2"}, {"2"}};
        String[][] arrayIsCorrectWithChar = new String[][]{{"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "q", "2", "2"}
                , {"2", "2", "2", "2"}};

        String[][] arrayIsCorrect = new String[][]{{"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}
                , {"2", "2", "2", "2"}};

        try {
            System.out.println(array4x4.stringArray(arrayNotCorrect));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(array4x4.stringArray(arrayIsCorrectWithChar));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(array4x4.stringArray(arrayIsCorrect));
        } catch (MyArraySizeException | MyArrayDataException | IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
