package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10; // assign once
        // data1 = 20; // X

        final int data2 = 20; // assign once
        // data2 = 30 // X
    }

    static void method(final int parameter) {
        // parameter = 30; // X
    }
}
