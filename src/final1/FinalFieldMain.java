package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // construct init
        System.out.println("construct init");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);


        // field init
        System.out.println("field init");
        FieldInit fieldInit1 = new FieldInit();
        System.out.println(fieldInit1.value);

        // const
        System.out.println("const");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
