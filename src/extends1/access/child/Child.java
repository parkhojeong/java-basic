package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        super.publicMethod();
        super.protectedMethod();
        // super.privateMethod();
        // super.defaultMethod();

        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        // defaultValue = 1; // X
        // privateValue = 2; // X
    }
}
