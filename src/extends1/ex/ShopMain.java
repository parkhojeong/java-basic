package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "1234");
        Album album = new Album("Album1", 15000, "seo");
        Movie movie = new Movie("Movie1", 18000, "director1", "actor1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("sum = " + sum);
    }
}
