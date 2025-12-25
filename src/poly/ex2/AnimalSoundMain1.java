package poly.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        sound(dog);
        sound(cat);
        sound(caw);
    }

    private static void sound(Animal animal) {
        System.out.println("sound test start");
        animal.sound();
        System.out.println("sound test end");
    }


}
