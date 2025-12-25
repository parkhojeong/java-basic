package poly.ex.pay1;

public class PaycoPay implements Pay{

    @Override
    public boolean pay(int amount) {
        System.out.println("NaverPay.pay");
        System.out.println("amount = " + amount);
        return true;
    }
}
