package school.lesson2;

public class ChangeNumbersInArray {
    public void changeNumbersInArray(int[] array) {
        for (int n :
                array) {
            switch (n) {
                case 0:
                    n = 1;
                    break;
                case 1:
                    n = 0;
                    break;
            }
            System.out.print(n+" ");
        }
    }
}
