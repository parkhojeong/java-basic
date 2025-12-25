package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        int amount1 = 5000;
        payService.setPay(new KakaoPay());
        payService.processPay(amount1);

        int amount2 = 10000;
        payService.setPay(new NaverPay());
        payService.processPay(amount2);

        int amount3 = 20000;
        payService.setPay(new PaycoPay());
        payService.processPay(amount3);
    }
}
