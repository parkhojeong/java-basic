package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        DecoUtil1 decoUtil1 = new DecoUtil1();
        System.out.println(decoUtil1.deco("Hello"));

        System.out.println(DecoUtil2.decoStatic("Hello"));
    }
}
