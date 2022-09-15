package school.lesson2;

public class CheckSumBetweenBorders {
    public boolean checkSumInBorders(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
