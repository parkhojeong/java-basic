package class1;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("student1", 15, 90); // student instance reference
        Student student2 = new Student("student2", 16, 80);
        Student[] students = {student1, student2}; // instance reference array

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
