package school.lesson4.feeding_task5;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Тарелка пополнилась на " + amount + " еды");
        } else {
            System.out.println("Нельзя пополнить на отрицательное число");
        }
    }
}
