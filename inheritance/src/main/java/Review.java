public class Review {

    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;
    private Shop shop;
    private Theater theater;
    private String movie;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(Restaurant restaurant, String body, String author, int stars) {
        this.restaurant = restaurant;
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(Shop shop, String body, String author, int stars) {
        this.shop = shop;
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(Theater theater, String body, String author, int stars) {
        this.theater = theater;
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(Theater theater, String movie, String body, String author, int stars) {
        this.theater = theater;
        this.movie = movie;
        this.body = body;
        this.author = author;
        this.stars = stars;
    }


    public int getStars() {
        return stars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Shop getShop() {
        return shop;
    }

    public Theater getTheater() {
        return theater;
    }

    public String getMovie() {
        return movie;
    }

    @Override
    public String toString() {

        String starSymbols = "";
        String movieString;
        for(int i = 0; i < this.stars; i++) {
            starSymbols += "*";
        }
        if(movie == null) {
            movieString = "";
        }
        else {
            movieString = " Movie: " + movie;
        }

        return starSymbols + " " + body + " Written by: " + author + "." + movieString;
    }
}
