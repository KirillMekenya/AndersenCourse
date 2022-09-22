package school.lesson4.payment_task6;

public class DebitCard {

    private int balance;

    private final String cardNumber;

    public DebitCard(int balance, String cardNumber) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        printCardInfo();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deductBalance(int amount) {
        if (balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Списание с карты " + amount + " произошло успешно");
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void printCardInfo() {
        System.out.println("Карта: " + cardNumber + " доступный баланс: " + balance);
    }
}
