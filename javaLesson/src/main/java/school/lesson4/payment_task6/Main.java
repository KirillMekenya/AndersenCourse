package school.lesson4.payment_task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(new ArrayList<>());
        DebitCard card = new DebitCard(500, "4563 8763 6374 8904");

        payment.new Good("T-shirt polo", 100);
        payment.new Good("Jeans H&M", 70);
        payment.new Good("Sneakers New Balance", 300);

        System.out.println();
        payment.printGoodsInPayment();
        System.out.println();
        System.out.println("Итоговая цена за все товары " + payment.getPaymentTotalPrice());
        System.out.println();
        payment.payByCard(card);
        System.out.println("На карте осталось " + card.getBalance());
        System.out.println();

        //Попытка оплатить ещё раз
        payment.payByCard(card);
        System.out.println("На карте осталось " + card.getBalance());
    }
}
