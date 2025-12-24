package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview[] reviews = { new MovieReview("inception", "great"), new MovieReview("the matrix", "bad")};

        for (MovieReview review : reviews) {
            System.out.println("title: '" + review.getTitle() + "', review: '" + review.getReview() + "'");
        }
    }
}
