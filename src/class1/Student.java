package class1;

public class Student {
    String name;
    int age;
    int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String toString() {
        return "name: [" + name + "] age: [" + age + "] score: [" + score + "]";
    }
}
