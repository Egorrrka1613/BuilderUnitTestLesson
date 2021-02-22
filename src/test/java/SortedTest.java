import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedTest {

    @Test
    public void positiveArrayTest() {
        int[] testArray = {7, 2, 684, 5, 12};
        int[] expected = {2, 5, 7, 12, 684};

        Assertions.assertArrayEquals(expected, Sorted.sortBubble(testArray));
    }

    @Test
    public void negativeArrayTesT() {
        int[] testArray = {-4, -53, -10, -978, -1, -54};
        int[] expected = {-978, -54, -53, -10, -4, -1};

        Assertions.assertArrayEquals(expected, Sorted.sortBubble(testArray));
    }

    @Test
    public void combinedArrayTest() {
        int[] testArray = {8, -37, 1, 75, -12, 42, -6744, 0};
        int[] expected = {-6744, -37, -12, 0, 1, 8, 42, 75};

        Assertions.assertArrayEquals(expected, Sorted.sortBubble(testArray));
    }

    @Test
    public void defaultValueArrayTest() {
        int[] testArray = new int[5];
        int[] expected = {0, 0, 0, 0, 0};

        Assertions.assertArrayEquals(expected, Sorted.sortBubble(testArray));

    }

    @Test
    public void correctArrayTest() {
        int[] testArray = {-6, -1, 34, 65, 73};

        Assertions.assertArrayEquals(testArray, Sorted.sortBubble(testArray));
    }


}
