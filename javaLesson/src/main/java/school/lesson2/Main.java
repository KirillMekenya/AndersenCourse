package school.lesson2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        CheckSumBetweenBorders checkSumBetweenBorders = new CheckSumBetweenBorders();
        CheckSignOfNumber checkSignOfNumber = new CheckSignOfNumber();
        CheckSignOfNumberBoolean checkSignOfNumberBoolean = new CheckSignOfNumberBoolean();
        PrintString printString = new PrintString();
        ChangeNumbersInArray changeNumbersInArray = new ChangeNumbersInArray();
        FillArray fillArray = new FillArray();
        ArrayParamReturn arrayParamReturn = new ArrayParamReturn();
        LeapYearIdentify leapYearIdentify = new LeapYearIdentify();

        //task 1
        int a = random.nextInt(50);
        int b = random.nextInt(50);
        System.out.println("a = " + a + " b = " + b+". Is sum "+(a+b)+" belongs to interval - from 10 to 20?");
        System.out.println(checkSumBetweenBorders.checkSumInBorders(a, b));
        System.out.println();

        //task 2
        int number = random.nextInt(30 + 5) - 20;
        checkSignOfNumber.checkSignOfNumber(number);
        System.out.println();

        //task 3
        System.out.println(number + " is negative? " + checkSignOfNumberBoolean.checkSignOfNumberBoolean(number));
        System.out.println();

        //task 4
        int n = random.nextInt(10);
        String string = "Print me " + n + " times";
        printString.printString(string, n);
        System.out.println();

        //task *
        int year = random.nextInt(2022);
        System.out.println(year+" is leap? "+leapYearIdentify.isLeapYear(year));
        System.out.println();

        //task 5
        int[] array = new int[10];
        System.out.println("Initial array ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Changed array");
        changeNumbersInArray.changeNumbersInArray(array);
        System.out.println();
        System.out.println();

        //task 6
        int[] array1 = new int[100];
        fillArray.fillArray(array1);
        System.out.println();
        System.out.println();

        //task 7
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Initial array    1 5 3 2 11 4 5 2 4 8 9 1");
        System.out.print("Processed array ");
        for (int i :
                array2) {
            if (i < 6) {
                i *= 2;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //task 8
        int[][] array3 = new int[10][10];
        for (int i = 0; i<array3.length; i++) {
            for (int j = 0; j<array3.length; j++) {
                if (i==j || array3.length-i == j+1) {
                    array3[i][j] = 1;
                } else {
                    array3[i][j] = 0;
                }
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //task9
        int len = random.nextInt(40);
        int initialValue = random.nextInt(100);
        System.out.println("Array length is "+len+", initial value is "+initialValue);
        arrayParamReturn.returnArrayWithParams(initialValue, len);
        System.out.println();

    }
}
