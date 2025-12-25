package poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animals = {dog, cat, caw};

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
