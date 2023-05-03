package arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindSubArrayTest {
    @Test
    public void solution() {
        int[] arr = {5, 7, 8, 9, 3, 4, 2};
        FindSubArray findSubArray = new FindSubArray ();
        int Sum = 16;
        int[] expectedValue = {9, 3, 4};
        int[] actualValue = findSubArray.solution (arr, Sum);
        Assert.assertArrayEquals (expectedValue, actualValue);
    }
}
