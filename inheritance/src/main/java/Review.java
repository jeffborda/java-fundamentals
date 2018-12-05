public class Review {

    private String body;
    private String author;
    private int stars;
    private Object business;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setRestaurant(Object business) {
        this.business = business;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public Object getBusiness() {
        return business;
    }

    @Override
    public String toString() {

        String starSymbols = "";
        for(int i = 0; i < this.stars; i++) {
            starSymbols += "*";
        }
        return starSymbols + " " + body + " Written by: " + author + ".";
    }
}
