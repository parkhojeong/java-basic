package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. staticCall()");
        staticCall();

        System.out.println("2. instanceCall()");
        DecoData data = new DecoData();
        data.instanceCall();

        System.out.println("3. staticCall(data)");
        staticCall(data);
    }
}
