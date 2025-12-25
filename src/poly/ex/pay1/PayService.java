package poly.ex.pay1;

public class PayService {
    private Pay pay;

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void processPay(int amount) {
        System.out.println("PayService.processPay");
        System.out.println("pay = " + pay);
        System.out.println("amount = " + amount);

        if(pay == null) {
            System.out.println("payment method is empty ");
            return;
        }

        boolean result = pay.pay(amount);

        if(result) {
            System.out.println("payment success");
        }
    }
}
