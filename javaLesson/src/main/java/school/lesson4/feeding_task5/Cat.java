package school.lesson4.feeding_task5;

public class Cat {

    private final String name;

    private final int appetite;

    private boolean fullness = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() - this.appetite >= 0) {
            plate.decreaseFood(appetite);
            fullness = true;
            System.out.println(name + " съел "+appetite+" еды и насытился");
        } else {
            System.out.println(this.name + " не сможет насытиться этим, в тарелке должно быть минимум "
                    + this.appetite + " еды");
        }
    }

    public void getCatInfo() {
        System.out.println(this.name+" сытость: "+this.fullness+" аппетит: "+this.appetite);
    }
}
