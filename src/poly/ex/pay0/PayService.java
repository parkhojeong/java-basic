package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("PayService.processPay");
        System.out.println("option = " + option);
        System.out.println("amount = " + amount);
        if (option.equals("kakao")) {
            result = new KakaoPay().pay(amount);
        } else if(option.equals("naver")){
            result = new NaverPay().pay(amount);

        } else{
            System.out.println("payment method is empty ");
            result = false;
        }

        if(result) {
            System.out.println("payment success");
        }
    }
}
