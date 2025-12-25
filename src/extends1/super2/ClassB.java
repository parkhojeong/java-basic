package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        // super() must be first statement in constructor body
        super(); // omission possible default constructor
        System.out.println("ClassB.ClassB, a=" + a);
    }

    public ClassB(String a) {
        // this() must be first statement in constructor body
        this(10, 20);
        System.out.println("ClassB.ClassB, a = " + a);
    }

    public ClassB(int a, int b) {
        //   super(); // omission possible default constructor
        System.out.println("ClassB.ClassB, a= " + a + ", b=" + b);
    }
}
