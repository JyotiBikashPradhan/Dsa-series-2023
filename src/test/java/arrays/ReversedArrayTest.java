package arrays;

import org.junit.Assert;
import org.junit.Test;


public class ReversedArrayTest {
    @Test
    public void solution() {
        int[] arr = {5,10,20,30,40};
        ReversedArray reversedArray = new ReversedArray ();
        int[] expectedValue = {40,30,20,10,5};
        int[] actualValue = reversedArray.solution (arr);
        Assert.assertArrayEquals (expectedValue,actualValue);

    }
}

