package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        sound(dog);
        sound(chicken);
        sound(bird);

        fly(chicken);
        fly(bird);

    }

    private static void sound(AbstractAnimal animal) {
        System.out.println("== sound test start ==");
        animal.sound();
        System.out.println("== sound test end ==");
    }

    private static void fly(Fly fly) {
        System.out.println("== fly test start ==");
        fly.fly();
        System.out.println("== fly test end ==");
    }
}
