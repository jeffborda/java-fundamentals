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

    }

    @Test
    public void testToString() {
    }
}