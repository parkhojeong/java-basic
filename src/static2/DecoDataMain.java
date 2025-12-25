package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. staticCall()");
        DecoData.staticCall();

        System.out.println("2. instanceCall()");
        DecoData data = new DecoData();
        data.instanceCall();

        System.out.println("3. staticCall(data)");
        DecoData.staticCall(data);
    }
}
