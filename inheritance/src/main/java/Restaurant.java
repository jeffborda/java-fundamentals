import java.util.LinkedList;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Restaurant {

    private String name;
    private int price;
    private int stars;
    LinkedList<Review> reviewList;

    public Restaurant(String name, int price) {
        this.name = name;
        this.price = price;
        this.stars = 0;
        this.reviewList = new LinkedList<>();
    }

    public void addReview(String body, String author, int stars) {
        Review review = new Review(body, author, stars);
        reviewList.add(review);
        this.updateStars();
    }

    private void updateStars() {
        int total = 0;
        for(Review review : reviewList) {
            total += review.getStars();
        }
        this.stars = total / reviewList.size();
    }



    @Override
    public String toString() {

        String priceSymbols = "";
        String starSymbols = "";
        String reviews = "";

        for(int i = 0; i < this.price; i++) {
            priceSymbols += "$";
        }
        for(int i = 0; i < this.stars; i++) {
            starSymbols += "*";
        }
        if(stars == 0) {
            starSymbols = "No reviews.";
        }

        for(Review review : reviewList) {
            reviews += review.toString() + "\n";
        }

        return name + ": " + priceSymbols + ", " + starSymbols + "\n" + "Reviews: " + reviews;
    }
}