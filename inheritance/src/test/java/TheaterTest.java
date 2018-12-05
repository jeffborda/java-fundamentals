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
        Theater cineplex = new Theater("Cineplex");
        assertTrue("Confirm that movie list is empty to start with.", cineplex.getMovieList().isEmpty());
        cineplex.addMovie("Harry Potter");
        assertEquals("Confirm list is size '1' after adding a movie.", 1, cineplex.getMovieList().size());
        assertEquals("Confirm movie title in the list is 'Harry Potter'.", "Harry Potter", cineplex.getMovieList().getFirst());
        cineplex.addMovie("Pets");
        cineplex.addMovie("2001 A Space Odyssey");
        assertEquals("Confirm movie list is now size '3' after two more adds.", 3, cineplex.getMovieList().size());
    }

    @Test
    public void testRemoveMovie() {
        Theater cineplex = new Theater("Cineplex");
        cineplex.addMovie("Harry Potter");
        cineplex.addMovie("Pets");
        assertFalse("Should return 'false' when removing a movie not in the list.", cineplex.removeMovie("Frozen"));
        assertTrue("Should return 'true' when removing a movie in the list.", cineplex.removeMovie("Harry Potter"));
        assertFalse("Confirm that 'Harry Potter' has been removed, should return 'false'.", cineplex.removeMovie("Harry Potter"));
        assertTrue("Should return 'true' when removing a movie in the list.", cineplex.removeMovie("Pets"));
        assertTrue("List should now be empty after removing all movies from the list.", cineplex.getMovieList().isEmpty());
    }

    @Test
    public void testToString() {
        Theater cineplex = new Theater("Cineplex");
        assertEquals("Test toString without movies or reviews", "Cineplex\n" + "Movies Playing: No movies currently playing.\n" + "Theater Reviews: No reviews.", cineplex.toString());
        cineplex.addMovie("Harry Potter");
        cineplex.addMovie("Pets");
        Review review1 = new Review(cineplex, "Pets", "Loved it!", "John", 4);
        Review review2 = new Review(cineplex, "Harry Potter", "Hated it!", "Beth", 2);
        assertEquals("Test toString without reviews.", "Cineplex\n" + "Movies Playing: Harry Potter, Pets\n" + "Theater Reviews: No reviews.", cineplex.toString());
        cineplex.addReview(review1);
        cineplex.addReview(review2);
        assertEquals("Test toString with movies and reviews.", "Cineplex\n" + "Movies Playing: Harry Potter, Pets\n" + "Theater Reviews: \n" + "**** Loved it! Written by: John. Movie: Pets\n" + "** Hated it! Written by: Beth. Movie: Harry Potter", cineplex.toString());
    }
}