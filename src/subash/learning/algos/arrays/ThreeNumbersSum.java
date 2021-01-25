package subash.learning.algos.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumbersSum {


    //time complexity: O(n2)
    //space complexity O(n)
    public  List<Integer[]> threeNumberSum(int[] array, int targetSum){

        Arrays.sort(array);
        List<Integer[]> twoDimentionalArr = new ArrayList<Integer[]>();
        for(int i =0;i<array.length-1; i++){
            int left = i +1;
            int right = array.length-1;
            while(left < right){
                int newSum = array[i] +array[left] + array[right];
                if(newSum == targetSum){
                    Integer[] newIntArray = {array[i],array[left], array[right]};
                    twoDimentionalArr.add(newIntArray);
                    left++;
                    right--;
                } else if(newSum >targetSum){
                    right--;
                } else if( newSum < targetSum) {
                    left ++;
                }
            }
        }
        return twoDimentionalArr;
}

    //time complexity: O(n3)
    //space complexity O(n)
    public  List<Integer[]> threeNumberSum1(int[] array, int targetSum){
        Arrays.sort(array);
        List<Integer[]> twoDimentionalArr = new ArrayList<Integer[]>();
        for(int i =0; i< array.length-2; i++){
            for(int j = i+1; j< array.length-1; j++){
                for(int k = j+1; k<array.length;k++){
                    int currentSum = array[i]+array[j]+array[k];
                    if(currentSum == targetSum){
                        Integer[] newIntArray = {array[i],array[j], array[k]};
                        twoDimentionalArr.add(newIntArray);
                    }
                }
            }
        }
        return twoDimentionalArr;
    }

    public static void main(String[] args) {

//        int[] testArray = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
//        int targetSum = 0;
//        System.out.println(" Method---->" +Arrays.deepToString((threeNumberSum(testArray,targetSum).toArray())));
//        System.out.println(" Method2---->" +Arrays.deepToString((threeNumberSum1(testArray,targetSum).toArray())));
    }
}
