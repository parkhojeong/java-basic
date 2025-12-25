package poly.ex.pay1;

public class NaverPay implements Pay{
    public boolean pay(int amount) {
        System.out.println("NaverPay.pay");
        System.out.println("amount = " + amount);
        return true;
    }
}
