package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("java", "java book", 10000);
        book2.displayInfo();

        Book book3 = new Book("java", "java book");
        book3.displayInfo();

    }
}
