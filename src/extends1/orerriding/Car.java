package extends1.orerriding;

import java.io.IOException;

public class Car {

    public Car() {
    }

    public void move() {
        System.out.println("Car moving");
    }

    public void openDoor() {
        System.out.println("Car opening door");
    }

    private void privateMethod() {}

    static void staticMethod() {}

    final void finalMethod() {}

    public void errorMethod() throws Exception {}

    public void errorMethod2() throws RuntimeException, IOException {
    }

    public Object returnMethod() {
        return new Object();
    }
}
