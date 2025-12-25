package static2.ex;

public class Car {
    String name;
    static int totalCars = 0;

    public Car(String name) {
        System.out.println("new car, name=" + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("Total cars: " + totalCars);
    }
}
