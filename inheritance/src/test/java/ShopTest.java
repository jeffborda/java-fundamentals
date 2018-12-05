import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testConstructor() {
        Shop petco = new Shop("Petco", "The pet superstore.", 2);
        Shop qfc = new Shop("QFC", "Grocery store.", 3);

        assertEquals("Confirm name field gets set correctly.", "Petco", petco.getName());
        assertEquals("Confirm description field gets set correctly.", "The pet superstore.", petco.getDescription());
        assertEquals("Confirm price field gets set correctly.", 2, petco.getPrice());
        assertTrue("Confirm list of Reviews is empty.", petco.getReviewList().isEmpty());
        assertEquals("Confirm name field gets set correctly.", "QFC", qfc.getName());
        assertEquals("Confirm description field gets set correctly.", "Grocery store.", qfc.getDescription());
        assertEquals("Confirm price field gets set correctly.", 3, qfc.getPrice());
        assertTrue("Confirm list of Reviews is empty.", qfc.getReviewList().isEmpty());
    }

    @Test
    public void testAddReview() {

        Shop petco = new Shop("Petco", "The pet superstore.", 2);
        Review petcoReview1 = new Review("This is where I like to get dog food and treats.", "Sandy Lee", 4);
        Review petcoReview2 = new Review("I like to buy hamsters there to feed to my snake.", "Billy Bob", 3);
        petco.addReview(petcoReview1);

        assertEquals("Ensure review author's name is 'Sandy Lee'", "Sandy Lee", petco.getReviewList().get(0).getAuthor());
        assertEquals("Ensure review body was input correctly", "This is where I like to get dog food and treats.", petco.getReviewList().get(0).getBody());
        assertEquals("Ensure review stars is '4'", 4, petco.getReviewList().get(0).getStars());
        petco.addReview(petcoReview2);
        assertEquals("Confirm list of reviews is size '2' after adding another review", 2, petco.getReviewList().size());


    }

    @Test
    public void testToString() {
        Shop petco = new Shop("Petco", "The pet superstore.", 2);
        assertEquals("Check toString formatted correctly.", "Petco: The pet superstore. $$\nReviews: No reviews.", petco.toString());

        Review petcoReview1 = new Review("This is where I like to get dog food and treats.", "Sandy Lee", 4);
        petco.addReview(petcoReview1);
        assertEquals("Check toString formatted correctly with one review added.", "Petco: The pet superstore. $$\n" + "Reviews: \n" +"**** This is where I like to get dog food and treats. Written by: Sandy Lee.", petco.toString());

        Review petcoReview2 = new Review("I like to buy hamsters there to feed to my snake.", "Billy Bob", 3);
        petco.addReview(petcoReview2);
        assertEquals("Check toString formatted correctly with two reviews added.", "Petco: The pet superstore. $$\n" + "Reviews: \n" + "**** This is where I like to get dog food and treats. Written by: Sandy Lee.\n" + "*** I like to buy hamsters there to feed to my snake. Written by: Billy Bob.", petco.toString());
    }
}