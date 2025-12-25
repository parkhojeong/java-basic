package poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal animal1 = new Animal(); // wrong case
        Pig pig = new Pig(); // not implement sound()
        Animal[] animals = {dog, cat, caw, animal1, pig};

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
