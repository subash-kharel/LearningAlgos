package subash.learning.algos.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourNumbersSum {


    // O(n^4) time complexity
    //O(1) space complexity
    public static List<Integer[]> fourNumberSum(int[] array, int target){
        Arrays.sort(array);
        List<Integer[]> arrayOfInteger = new ArrayList<>();
        for(int i =0; i<array.length-3;i++){
            for(int j= i+1; j<array.length-2;j++){
                for(int k =j+1; k<array.length-1;k++){
                    for(int l = k+1; l<array.length;l++){
                        if((array[i]+array[j]+array[k]+array[l]) == target){
                            Integer[] matchedArr = {array[i],array[j],array[k],array[l]};
                            arrayOfInteger.add(matchedArr);
                        }
                    }
                }
            }
        }
        return arrayOfInteger;
    }

    public static void main(String[] args) {
          int[] testArray = new int[]{7, 6, 4, -1, 1, 2};
        int targetSum = 16;
      System.out.println(" Method---->" + Arrays.deepToString((fourNumberSum(testArray,targetSum).toArray())));
    }
}
