package poly.ex.pay2;

public class KakaoPay implements Pay{
    public boolean pay(int amount) {
        System.out.println("KakaoPay.pay");
        System.out.println("amount = " + amount);
        return true;
    }
}
