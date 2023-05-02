package arrays;


import org.junit.Assert;
import org.junit.Test;



public class FindMinMaxTest {
    @Test
    public void solution (){

        int[] arr={1,2,3,4,75,9};
        FindMinMax findMinMax=new FindMinMax ();
        int[] expectedValue = {1,75 };
        int[] actualValue = findMinMax.solution(arr);
        Assert.assertArrayEquals(expectedValue, actualValue);

    }
}
