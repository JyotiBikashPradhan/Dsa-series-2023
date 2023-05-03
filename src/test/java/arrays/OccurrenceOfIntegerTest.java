package arrays;

import org.junit.Assert;
import org.junit.Test;

public class OccurrenceOfIntegerTest {
    @Test
    public void solution() {
        OccurrenceOfInteger occurrenceOfInteger = new OccurrenceOfInteger ();
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 1, 1, 1, 5, 5, 5, 4, 4, 4, 7, 7, 7};
        int number = 5;
        int expectedValue = 6;
        int actualValue = occurrenceOfInteger.solution (arr, number);
        Assert.assertEquals (expectedValue, actualValue);

    }
}
