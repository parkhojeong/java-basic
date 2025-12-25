package poly.ex4;


import poly.ex3.Pig;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animals = {dog, cat, caw};

        for (Animal animal : animals) {
            sound(animal);
            move(animal);
        }
    }

    private static void sound(Animal animal) {
        System.out.println("sound test start");
        animal.sound();
        System.out.println("sound test end");
    }

    private static void move(Animal animal) {
        System.out.println("move test start");
        animal.move();
        System.out.println("move test end");
    }

}
