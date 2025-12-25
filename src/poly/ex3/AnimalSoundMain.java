package poly.ex3;


public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        // Animal animal1 = new Animal(); // not allowed
        Pig pig = new Pig(); // enforce implement sound()
        Animal[] animals = {dog, cat, caw, pig};

        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal) {
        System.out.println("sound test start");
        animal.sound();
        System.out.println("sound test end");
    }
}
