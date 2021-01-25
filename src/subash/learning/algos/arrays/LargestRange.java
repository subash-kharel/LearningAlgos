package subash.learning.algos.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Write a function that takes in a array of integers and returns an array of length of 2
//representing a largest range of integers contained in an array
public class LargestRange {



    //time complexity: think O(nlogn) due to sorting(sorting takes logn)
    //space: O(n)
    public static int[] largestRange(int[] arrayOfIntegers){

        Arrays.sort(arrayOfIntegers);
        int[] distinctArray = Arrays.stream(arrayOfIntegers).distinct().toArray();
        HashSet<Integer> setofIntegers = new HashSet<>();
        int[] result = {};
        for(int eachSet: distinctArray){
            setofIntegers.add(eachSet);
        }
        int resultMaxLength = 0;
        if(distinctArray.length ==1){
            return new int[]{distinctArray[0],distinctArray[0]};
        }
        for(int i=0; i<distinctArray.length-1;i++){


            int nextInSeq = distinctArray[i] +1;
            int counterOfLength =1;
            while(setofIntegers.contains(nextInSeq)){
                counterOfLength++;
                setofIntegers.remove(nextInSeq);
                nextInSeq++;
            }
            resultMaxLength = Math.max(resultMaxLength,counterOfLength);
            if(resultMaxLength <= counterOfLength){
                result = new int[]{distinctArray[i], distinctArray[i+counterOfLength-1]};
            }
        }
        return result;
    }

    public static int[] largestRange1(int[] arrayOfIntegers){
        int[] bestRange = new int[2];
        int longestLength = 0;
        Map<Integer, Boolean> numbers = new HashMap<>();
        for(int num: arrayOfIntegers){
            numbers.put(num,Boolean.TRUE);
        }
        for(int num: arrayOfIntegers){
            int left = num-1;
            int right = num +1;
            int currentLength = 1;

            while(numbers.containsKey(left)){
                numbers.put(left,Boolean.FALSE);
                currentLength++;
                left--;
            }
            while(numbers.containsKey(right)){
                numbers.put(right,Boolean.FALSE);
                currentLength++;
                right++;
            }
            if(currentLength > longestLength){
                longestLength = currentLength;
                bestRange = new int[] {left+1, right-1};
            }
        }

        return bestRange;
    }

    public static void main(String[] args) {


          int[] arrayOfIntegers = {1,11,3,0,15,5,2,4,10,7,12,6};
//        int[] arrayOfIntegers = {1,2};
        // int[] arrayOfIntegers ={1};
        // int[] arrayOfIntegers ={8,4,2,10,3,6,7,9,1};
//        int[] arrayOfIntegers = {19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14};
        System.out.println(Arrays.toString(largestRange(arrayOfIntegers)) );
    }

}
