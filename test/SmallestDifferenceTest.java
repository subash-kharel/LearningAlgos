import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import subash.learning.algos.arrays.SmallestDifference;

import java.util.Arrays;

public class SmallestDifferenceTest {

    SmallestDifference smallestDifference;

    @Before
    public void setUp(){
        smallestDifference = new SmallestDifference();
    }

    @Test
    public void testSmallestDifference(){
        int[] firstArray = {-1,5,10,20,28,3};
        int[] secondArray = {26,134, 135,15,17};
        int[] actual = {28,26};
        Assert.assertArrayEquals(actual, smallestDifference.smallestDifference(firstArray,secondArray));
    }

    @Test
    public void testSmallestDifferenceReturnsNotNull(){
        int[] firstArray = {-1,5,10,20,28,3};
        int[] secondArray = {26,134, 135,15,17};
        int[] actual = {28,26};
        Assert.assertNotNull( smallestDifference.smallestDifference(firstArray,secondArray));
    }
}
