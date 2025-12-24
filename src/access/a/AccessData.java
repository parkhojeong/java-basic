package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("AccessData.publicMethod");
    }

    void defaultMethod() {
        System.out.println("AccessData.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("AccessData.privateMethod");
    }

    public void innerAccess() {
        System.out.println("AccessData.innerAccess");
        publicField = 10;
        defaultField = 20;
        privateField = 30;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
