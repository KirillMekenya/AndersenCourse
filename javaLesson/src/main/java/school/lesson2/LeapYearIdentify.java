package school.lesson2;

public class LeapYearIdentify {
    public boolean isLeapYear(int year) {
        boolean bool;
        if (year % 4 == 0) {
            bool = true;
            if (year % 100 == 0 && year % 400 != 0) {
                bool = false;
            } else if (year % 100 == 0 && year % 400 == 0) {
                bool = true;
            }
        } else {
            bool = false;
        }
        return bool;
    }

}
