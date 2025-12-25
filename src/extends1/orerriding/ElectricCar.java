package extends1.orerriding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("Electric car moving");
    }

    public void charge() {
        System.out.println("Electric car charging");
    }
}
