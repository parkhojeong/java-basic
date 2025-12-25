package extends1.orerriding;

import java.io.IOException;

public class OverrideCar extends Car{

    // private X
    //Method does not override method from its superclass
    //@Override // X
    public void privateMethod() {
    }

    // static X
    //Static methods cannot be annotated with @Override
    //@Override
    static void staticMethod() {}

    // final X
    // cannot override 'finalMethod()' in 'extends1.orerriding.Car'; overridden method is final
    // @Override
    // final void finalMethod() {}

    // constructor X
    // Method return type missing or constructor name does not match class name
    // @Override
    // public Car() {}
    // exception - child class
    @Override
    public void errorMethod() throws IOException {}

    // exception - small class count
    @Override
    public void errorMethod2() throws IOException {}

    // return type: allow child
    @Override
    public String returnMethod() {
        return "";
    }
}
