package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        // There is no no-arg constructor available in 'extends1.super2.ClassB'
        super(10); // omission not possible
        System.out.println("ClassC.ClassC");
    }
}
