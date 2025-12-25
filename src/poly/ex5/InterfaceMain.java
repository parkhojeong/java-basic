package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // not allowed
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        InterfaceAnimal[] animals = {cat, caw, dog};
        for (InterfaceAnimal animal : animals) {
            sound(animal);
        }
    }

    public static void sound(InterfaceAnimal animal) {
        System.out.println("== sound test start ==");
        animal.sound();
        System.out.println("== sound test end ==");
    }
}
