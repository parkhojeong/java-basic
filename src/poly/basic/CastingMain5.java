package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println( parent1 instanceof Parent); // T
        System.out.println( parent1 instanceof Child); // F

        Parent parent2 = new Child();
        System.out.println( parent2 instanceof Parent); // T
        System.out.println( parent2 instanceof Child); // T

        if(parent2 instanceof Child child) {
            child.childMethod();
        }
    }
}
