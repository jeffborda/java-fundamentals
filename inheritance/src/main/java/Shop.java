import java.util.LinkedList;

public class Shop implements Business {

    String name;
    String description;
    int price;
    LinkedList<Review> reviewList;

    public Shop(String name, String description, int price) {

        this.name = name;
        this.description = description;
        this.price = price;
        reviewList = new LinkedList<>();
    }

    /**
     * Adds a review about a Shop to it's list of reviews.
     */
    public void addReview(Review review) {

        reviewList.add(review);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public LinkedList<Review> getReviewList() {
        return reviewList;
    }

    /**
     * Helper function that converts the int price to a string of dollar signs $$$
     * */
    private String convertPriceToSymbols() {
        String result = "";
        if(price <= 0) {
            return "$";
        }
        else {
            for(int i = 0; i < price; i++) {
                result += "$";
            }
        }
        return result;
    }

    @Override
    public String toString() {

        String priceSymbols = convertPriceToSymbols();

        String reviews = "";
        for(Review review : reviewList) {
            reviews += review.toString();
        }

        return name + ": " + priceSymbols + ", " + "Description: " + description + "\n" + "Reviews: " + reviews;
    }
}
