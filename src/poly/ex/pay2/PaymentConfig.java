package poly.ex.pay2;

public class PaymentConfig {
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if(option.equals("naver")){
            return new NaverPay();
        } else {
            return new Pay() {
                @Override
                public boolean pay(int amount) {
                    System.out.println("payment method is empty ");
                    return false;
                }
            };
        }
    }
}
