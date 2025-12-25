package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceCall();

        staticValue++;
        staticMethod();
    }

    public static void staticMethod() {
        System.out.println("DecoData.staticMethod");
    }

    public void instanceMethod() {
        System.out.println("DecoData.instanceMethod");
    }
}
