/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant bobs = new Restaurant("Bob's Burgers", 2);
        assertEquals("Should print name followed by dollar signs then stars.", "Bob's Burgers: $$, No reviews.\nReviews: ", bobs.toString());

        Restaurant toshis = new Restaurant("Toshi's", 5);
        assertEquals("Should print name followed by dollar signs then stars.", "Toshi's: $$$$$, No reviews.\nReviews: ", toshis.toString());

        Restaurant mcdonalds = new Restaurant("McDonald's", 1);
        assertEquals("Should print name followed by dollar signs then stars.", "McDonald's: $, No reviews.\nReviews: ", mcdonalds.toString());

        Review bobReview1 = new Review("I love Bob's!", "Jeff", 3);
        bobs.addReview(bobReview1);
        assertEquals("Should print the Restaurant data followed by Reviews.", "Bob's Burgers: $$, ***\n" + "Reviews: *** I love Bob's! Written by: Jeff.\n", bobs.toString());

        Review bobReview2 = new Review("I got ecoli from Bob's. Thanks a lot!", "Alissa", 1);
        bobs.addReview(bobReview2);
        assertEquals("Should print the Restaurant data followed by Reviews.", "Bob's Burgers: $$, **\n" + "Reviews: *** I love Bob's! Written by: Jeff.\n" + "* I got ecoli from Bob's. Thanks a lot! Written by: Alissa.\n", bobs.toString());
    }

    @Test
    public void testAddReview() {

        Restaurant robertos = new Restaurant("Roberto's", 3);
        Review robertosReview1 = new Review("Review body.", "Name", 4);
        robertos.addReview(robertosReview1);
        assertEquals("Make sure the list is size '1' with one review added.", 1, robertos.getReviewList().size());
        assertEquals("Make sure review String has been added correctly.", "**** Review body. Written by: Name.", robertos.getReviewList().get(0).toString());

        Review robertosReview2 = new Review("I like Roberto's.", "James", 3);
        robertos.addReview(robertosReview2);
        assertEquals("Make sure list is now size '2'", 2, robertos.getReviewList().size());

    }

    @Test
    public void testUpdateStars() {

        Restaurant mcdonalds = new Restaurant("McDonald's", 3);
        assertEquals("With no reviews, stars should be '0'.", 0, mcdonalds.getStars());

        Review mcdonaldsReview = new Review("I like the fries.", "Carol", 4);
        mcdonalds.addReview(mcdonaldsReview);
        assertEquals("One review added with 4 stars, so star average should be '4'.", 4, mcdonalds.getStars());

        Review mcdonaldsReview2 = new Review("Not bad.", "Zahra", 2);
        mcdonalds.addReview(mcdonaldsReview2);
        assertEquals("Average should now be '3'.", 3, mcdonalds.getStars());
    }

}
