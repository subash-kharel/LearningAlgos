import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import subash.learning.algos.arrays.ThreeNumbersSum;
import subash.learning.algos.arrays.TwoNumbersSum;

public class TwoNumbersSumTest {

    TwoNumbersSum twoNumbersSum;
    @Before
    public void setUp(){
        twoNumbersSum = new TwoNumbersSum();
    }

    @Test
    public void testTwoNumberSum(){
        int[] testArray = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] expected = {11,-1};
        Assert.assertArrayEquals(expected, twoNumbersSum.twoNumberSum(testArray,targetSum));
    }

}
