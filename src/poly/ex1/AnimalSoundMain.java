package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("sound test start");
        dog.sound();
        System.out.println("sound test end");

        System.out.println("sound test start");
        cat.sound();
        System.out.println("sound test end");

        System.out.println("sound test start");
        caw.sound();
        System.out.println("sound test end");
    }
}
