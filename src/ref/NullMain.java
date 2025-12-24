package ref;

public class NullMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println(data.value1);
        System.out.println(data.value2);

        data = null; // garbage collection target
    }
}
