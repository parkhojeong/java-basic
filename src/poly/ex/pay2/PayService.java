package poly.ex.pay2;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("PayService.processPay");
        System.out.println("option = " + option);
        System.out.println("amount = " + amount);

        result = executePayment(option, amount);

        if(result) {
            System.out.println("payment success");
        } else {
            System.out.println("payment method is empty ");
        }
    }

    private static boolean executePayment(String option, int amount) {
        Pay pay = PaymentConfig.findPay(option);
        return pay.pay(amount);
    }
}
