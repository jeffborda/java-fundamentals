import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testConstructor() {
        Theater cineplex = new Theater("Cineplex");
        Theater cinerama = new Theater("Cinerama");
        Theater imax = new Theater("Imax");
        assertEquals("Theater name should be 'Cineplex'.", "Cineplex", cineplex.getName());
        assertEquals("Theater name should be 'Cinerama'.", "Cinerama", cinerama.getName());
        assertEquals("Theater name should be 'Imax'.", "Imax", imax.getName());
        assertTrue("Confirm that movie list is empty.", cineplex.getMovieList().isEmpty());
    }

    @Test
    public void testAddReview() {
        Theater cineplex = new Theater("Cineplex");
        Review review1 = new Review("This theater has a nice screen.", "Mr. Bobby", 4);
        cineplex.addReview(review1);
        assertEquals("Confirm review list is size '1'", 1, cineplex.getReviewList().size());
        assertEquals("Confirm review body is correct.", "This theater has a nice screen.", cineplex.getReviewList().get(0).getBody());
        assertEquals("Confirm review author is correct.", "Mr. Bobby", cineplex.getReviewList().get(0).getAuthor());
        assertEquals("Confirm review stars is '4'.", 4, cineplex.getReviewList().get(0).getStars());
        Review review2 = new Review("This place stinks.", "Debbie Downer", 0);
        cineplex.addReview(review2);
        assertEquals("Confirm size of review list is now '2'", 2, cineplex.getReviewList().size());
    }

    @Test
    public void testAddMovie() {
    }

    @Test
    public void testRemoveMovie() {
    }

//    @Test
//    public String testToString() {
//        return null;
//    }
}