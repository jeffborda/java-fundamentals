import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testConstructor() {
        Review review = new Review("I like this place.", "Carol", 5);
        assertEquals("Confirm body", "I like this place.", review.getBody());
        assertEquals("Confirm author", "Carol", review.getAuthor());
        assertEquals("Confirm rating", 5, review.getStars());

    }
    @Test
    public void testConstructor_withRestaurant() {
        Restaurant mcdonalds = new Restaurant("McDonald's", 1);
        Review mcdonaldsReview = new Review(mcdonalds, "I love McDonalds", "Sam", 3);
        assertEquals("Confirm Restaurant is associated.", mcdonalds, mcdonaldsReview.getRestaurant());
        assertEquals("Confirm body of Review", "I love McDonalds", mcdonaldsReview.getBody());
    }

    @Test
    public void testConstructor_withTheatreAndMovie() {
        Theater cinerama = new Theater("Cinerama");
        Review review = new Review(cinerama, "Harry Potter", "I loved the movie!", "Tim", 4);
        assertEquals("Confirm Theater is associated with Review", cinerama, review.getTheater());
        assertEquals("Confirm movie title", "Harry Potter", review.getMovie());
        assertEquals("Confirm body of review", "I loved the movie!", review.getBody());
        assertEquals("Confirm author", "Tim", review.getAuthor());
        assertEquals("Confirm star rating.", 4, review.getStars());
    }

    @Test
    public void testToString() {
        Review bobsReview = new Review("Bob's Burgers was really good, and they have wonderful service.", "Dan", 4);
        String reviewBody = "Bob's Burgers was really good, and they have wonderful service.";
        assertEquals("Should return string with stars, then body, then author.", "**** " + reviewBody + " Written by: " + "Dan.", bobsReview.toString());

        Review toshisReview = new Review("Toshi's is my favorite teriaki restaurant.", "Sooz", 5);
        assertEquals("Should return string with stars, then body, then author.", "***** Toshi's is my favorite teriaki restaurant. Written by: Sooz.", toshisReview.toString());

    }
}