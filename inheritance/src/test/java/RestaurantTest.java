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

        bobs.addReview("I love Bob's!", "Jeff", 3);
        assertEquals("Should print the Restaurant data followed by Reviews.", "Bob's Burgers: $$, ***\n" + "Reviews: *** I love Bob's! Written by: Jeff.\n", bobs.toString());

        bobs.addReview("I got ecoli from Bob's. Thanks a lot!", "Alissa", 1);
        assertEquals("Should print the Restaurant data followed by Reviews.", "Bob's Burgers: $$, **\n" + "Reviews: *** I love Bob's! Written by: Jeff.\n" + "* I got ecoli from Bob's. Thanks a lot! Written by: Alissa.\n", bobs.toString());
    }

    @Test
    public void testAddReview() {

    }

}