package subash.learning.algos.arrays;

//  Write a function that takes in two non-empty arrays of integers, finds the pair of numbers
//          (one from each array) whose absolute difference is closest to zero, and returns an array containing
//          these two numbers, with the number from the first array in the first position.
//          Note that the absolute difference of two integers is the distance between them on the real number line.
//          For example, the absolute difference of -5 and 5is 10, and the absolute difference of -5 and -4 is 1.

import java.util.Arrays;

public class SmallestDifference {

    //Time Complexity: O(n2)
    //Space Complexity: O(1)
    public int[] smallestDifference(int[] firstArray, int[] secondArray){
        int[] resultArr = new int[]{};
        int prev = Integer.MAX_VALUE;
        for(int i =0; i< firstArray.length-1; i++){
            for(int j =0; j< secondArray.length-1;j++){
                int absFirstArrVal = firstArray[i];
                int absSecArrVal = secondArray[j];
                int difference = Math.abs(absFirstArrVal -  absSecArrVal) ;
                if(difference<prev){
                    prev = difference;
                    resultArr = new int[]{firstArray[i],secondArray[j]};
                }
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {

//        int[] firstArray = {-1,5,10,20,28,3};
//        int[] secondArray = {26,134, 135,15,17};
//        System.out.println(Arrays.toString(smallestDifference(firstArray,secondArray)) );
        //expected return here is : [28,26]
    }
}
