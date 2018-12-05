import java.util.LinkedList;

public class Theater implements Business {

    String name;
    LinkedList<String> movieList;
    LinkedList<Review> reviewList;

    public Theater(String name) {
        this.name = name;
        this.movieList = new LinkedList<>();
        this.reviewList = new LinkedList<>();
    }

    /**
     * Adds a review to the list of reviews.
     */
    public void addReview(Review review) {
        reviewList.add(review);
    }

    /**
     * Adds a movie title to the list of movies playing at theater.
     */
    public void addMovie(String movie) {
        movieList.add(movie);
    }

    /**
     * Removes a movie from the list of movies playing at theater.
     */
    public boolean removeMovie(String movie) {
        return movieList.remove(movie);
    }

    public String getName() {
        return name;
    }

    public LinkedList<String> getMovieList() {
        return movieList;
    }

    public LinkedList<Review> getReviewList() {
        return reviewList;
    }

    @Override
    public String toString() {

        String reviews = "";
        String movies = "";
        for(Review review : reviewList) {
            reviews += "\n" + review.toString();
        }
        if(reviews == "") {
            reviews += "No reviews.";
        }

        for(String movie : movieList) {
            movies += movie + ", ";
        }
        if(movies.endsWith(", ")) {
            movies = movies.substring(0, movies.length() - 2);
        }
        else if(movies.isEmpty()) {
            movies += "No movies currently playing.";
        }

        return name + "\n" + " Movies Playing: " + movies + "\n" + "Theater Reviews: " + reviews;
    }
}
