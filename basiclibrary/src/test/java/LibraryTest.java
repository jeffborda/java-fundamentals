/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testRoll() {
        Library classUnderTest = new Library();
        int[] dice = new int[6];
        dice = classUnderTest.roll(6);
        assertEquals("roll method should return 'true'", 6, classUnderTest.roll(6).length);
        assertTrue("roll medthod should return number beween 1 and 6 inclusive", dice[0] >= 1 && dice[0] <= 6);
        assertTrue("roll medthod should return number beween 1 and 6 inclusive", dice[0] >= 1 && dice[1] <= 6);
        assertTrue("roll medthod should return number beween 1 and 6 inclusive", dice[0] >= 1 && dice[2] <= 6);
        assertTrue("roll medthod should return number beween 1 and 6 inclusive", dice[0] >= 1 && dice[3] <= 6);
        assertTrue("roll medthod should return number beween 1 and 6 inclusive", dice[0] >= 1 && dice[4] <= 6);
        assertTrue("roll medthod should return number beween 1 and 6 inclusive", dice[0] >= 1 && dice[5] <= 6);
    }

    @Test
    public void testContainsDuplicates() {
        Library classUnderTest = new Library();
        int[] noDuplicatesArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] hasDuplicatesArray = {1, 2, 3, 4, 1, 2};
        assertFalse("containsDuplicates should return 'false'", classUnderTest.containsDuplicates(noDuplicatesArray));
        assertTrue("containsDuplicates should return 'true'", classUnderTest.containsDuplicates(hasDuplicatesArray));
    }

    @Test
    public void testCalculateAverage() {
        Library classUnderTest = new Library();
        int[] average1 = {1, 10, 25, 51}; // avg == 21.75, rounds to 22
        int[] average2 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}; // avg = 10
        assertEquals("calculateAverage should return '22'", 22, classUnderTest.calculateAverage(average1));
        assertEquals("calculateAverage should return '22'", 10, classUnderTest.calculateAverage(average2));
    }

    @Test
    public void testCalculateAverageOfArrays() {
        Library classUnderTest = new Library();
        int[][] average1 = { {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, /* 5.5 = 6*/
                             {11, 12, 13, 14, 15, 16, 17}, /* 14 */
                             {1, 5, 7, 9, 22, 44}, /* 14.7 = 15 */
                             {1, 5, 2, 1, 2}, /* 2.2 = 2 */
                             {55, 99, 105, 88, 998, 478} /* a big number */

        };

        int[] expectedArray = {1, 5, 2, 1, 2};

        assertArrayEquals("calculateAverageOfArrays should return array with lowest avg inside a 2D array", expectedArray, classUnderTest.calculateAverageOfArrays(average1) );
    }

    @Test
    public void testAnalyzeWeatherData() {
        Library classUnderTest = new Library();

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        classUnderTest.analyzeWeatherData(weeklyMonthTemperatures);
    }

    @Test
    public void testTally() {
        Library classUnderTest = new Library();

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = classUnderTest.tally(votes);
        System.out.println(winner + " received the most votes!");

        assertEquals("Winner should be 'Bush'", "Bush", classUnderTest.tally(votes));
    }

}
