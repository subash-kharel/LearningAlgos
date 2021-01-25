package subash.learning.algos.arrays;

import java.util.Arrays;
import java.util.HashSet;

//Write a function that takes in a array of integers and returns an array of length of 2
//representing a largest range of integers contained in an array
public class LargestRange {


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

    public static void main(String[] args) {


        //  int[] arrayOfIntegers = {1,11,3,0,15,5,2,4,10,7,12,6};
//        int[] arrayOfIntegers = {1,2};
        // int[] arrayOfIntegers ={1};
        // int[] arrayOfIntegers ={8,4,2,10,3,6,7,9,1};
        int[] arrayOfIntegers = {
                19,
                -1,
                18,
                17,
                2,
                10,
                3,
                12,
                5,
                16,
                4,
                11,
                8,
                7,
                6,
                15,
                12,
                12,
                2,
                1,
                6,
                13,
                14
        };
        System.out.println(Arrays.toString(largestRange(arrayOfIntegers)) );
    }

}
