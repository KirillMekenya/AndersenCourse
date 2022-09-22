package school.lesson4.payment_task6;

import java.util.ArrayList;

public class Payment {

    private ArrayList<Good> goods;
    private int paymentTotalPrice;

    public Payment(ArrayList<Good> goods) {
        this.goods = goods;
    }

    public void printGoodsInPayment() {
        for (Good good : goods) {
            System.out.println(good.getName() + " costs " + good.getPrice());
        }
    }

    public int getPaymentTotalPrice() {
        return paymentTotalPrice;
    }

    public void payByCard(DebitCard card) {
        System.out.println("Платёж будет оплачен картой " + card.getCardNumber());
        card.deductBalance(paymentTotalPrice);
    }

    public class Good {

        private final String name;

        private final int price;

        public Good(String name, int price) {
            this.name = name;
            this.price = price;
            addToPayment();
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public void addToPayment() {
            goods.add(this);
            paymentTotalPrice += price;
            System.out.println("Продукт " + name + " добавлен в корзину.");
        }
    }
}
