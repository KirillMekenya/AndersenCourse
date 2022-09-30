package school.lesson6;

import school.lesson6.exceptions.MyArrayDataException;
import school.lesson6.exceptions.MyArraySizeException;

import java.util.Arrays;

public class Array4x4 {

    private String[][] stringArray;

    public Array4x4 stringArray(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        boolean isLengthIs4 = true;
        for (String[] strings : stringArray) {
            if (!(strings.length == 4)) {
                isLengthIs4 = false;
                break;
            }
        }
        System.out.println();

        if (!(stringArray.length == 4) || !isLengthIs4) {
            throw new MyArraySizeException("Массив имеет размер не 4х4");
        } else {
            this.stringArray = stringArray;
            calculateSumOfElements();
        }
        return this;
    }

    private void calculateSumOfElements() throws MyArrayDataException {
        int[][] intArray = new int[4][4];
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    intArray[i][j] = Integer.parseInt(stringArray[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Элемент массива " + stringArray[i][j] + " содержит некорректные данные, " +
                            "ячейка [" + i + "] [" + j + "]");
                }
                sum += intArray[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива равна " + sum);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(stringArray);
    }
}
