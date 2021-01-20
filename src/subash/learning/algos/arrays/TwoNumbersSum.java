package subash.learning.algos.arrays;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumbersSum {

    // time complexity n^2; space complexity: O(1)
    public  int [] twoNumberSum(int[] arrayOfInts, int targetSum){
        for (int i = 0; i < arrayOfInts.length-1;i++){
            for(int j = i+1; j< arrayOfInts.length; j++){
                if((arrayOfInts[i] + arrayOfInts[j])== targetSum){
                    return new int[]{arrayOfInts[i], arrayOfInts[j]};
                }
            }
        }
        return new int[]{};
    }

    // time complexity O(n); space complexity: O(n)

    public  int [] twoNumberSum1(int[] arrayOfInts, int targetSum){
        Set<Integer> numbers = new HashSet<>();
        for(int number: arrayOfInts){
            int potentialTargetVal = targetSum - number;
            if(numbers.contains(potentialTargetVal)){
                return new int []{potentialTargetVal, number};
            } else {
                numbers.add(number);
            }
        }
        return new int[]{};
    }

    // time complexity O(logn); space complexity: O(1)
    public static int [] twoNumberSum2(int[] arrayOfInts, int targetSum){
      Arrays.sort(arrayOfInts);
      int frontPointer =0;
      int lastPointer = arrayOfInts.length-1;
      while(frontPointer < lastPointer){
          int currentSum = arrayOfInts[frontPointer]+arrayOfInts[lastPointer];
          if(currentSum == targetSum){
              return new int[] { arrayOfInts[lastPointer],arrayOfInts[frontPointer]};
          } else if (currentSum >targetSum){
              lastPointer--;
          }
          else {
              frontPointer ++;
          }
      }
      return new int[0];
    }





    public static void main(String[] args) {
//        int[] testArray = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
//        int targetSum = 10;
//        System.out.println("First Method---->" +Arrays.toString(twoNumberSum(testArray, targetSum)));
//        System.out.println("Second Method---->" +Arrays.toString(twoNumberSum1(testArray, targetSum)));
//        System.out.println("Third Method---->" +Arrays.toString(twoNumberSum2(testArray, targetSum)));
    }
}
