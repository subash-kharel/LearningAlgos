import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import subash.learning.algos.arrays.SmallestDifference;
import subash.learning.algos.arrays.ThreeNumbersSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumbersSumTest {
    ThreeNumbersSum threeNumbersSum;
    @Before
    public void setUp(){
        threeNumbersSum = new ThreeNumbersSum();
    }

    @Test
    public void threeNumbersSum(){
        int[] testArray = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        List<Integer[]> actual = new ArrayList<>();
        Integer[] actual1 = {-6,1,5};
        Integer[] actual2 = {-8,2,6};
        Integer[] actual3 = {-8,3,5};
        actual.add(actual2);
        actual.add(actual3);
        actual.add(actual1);
        //not sure why this doesnot work
//      Assert.assertEquals(actual, threeNumbersSum.threeNumberSum(testArray,targetSum));
        Assert.assertEquals(Arrays.deepToString(actual.toArray()), Arrays.deepToString(threeNumbersSum.threeNumberSum(testArray,targetSum).toArray()));
    }
}
