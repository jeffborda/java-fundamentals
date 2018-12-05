import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testConstructor() {
        Restaurant mcdonalds = new Restaurant("McDonald's")
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