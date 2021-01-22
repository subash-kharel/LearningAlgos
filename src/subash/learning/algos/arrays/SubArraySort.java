package subash.learning.algos.arrays;



//  Write a function that takes in an array of at least two integers and that
//          returns an array of the starting and ending indices of the smallest subarray
//          in the input array that needs to be sorted in place in order for the entire
//          input array to be sorted (in ascending order).
//If array is already sorted return [-1,-1];

import java.util.Arrays;

public class SubArraySort {


       public static int[] subArraySort(int[] array){
           int minOutOfOrder = Integer.MAX_VALUE;
           int maxOutOfOrder = Integer.MIN_VALUE;

           for(int i =0; i<array.length; i++) {
               int num = array[i];
               if (isOutofOrder(i, num, array)) {
                    minOutOfOrder = Math.min(minOutOfOrder,num);
                    maxOutOfOrder = Math.max(maxOutOfOrder,num);
               }
           }
           if(minOutOfOrder == Integer.MAX_VALUE){
               return new int[]{-1,-1};
           }
           int subArrIndexLeft = 0;
           while(minOutOfOrder >= array[subArrIndexLeft]){
               subArrIndexLeft++;
           }
           int subArrIndexRight = array.length-1;
           while(maxOutOfOrder <= array[subArrIndexRight]){
               subArrIndexRight --;
           }
           return new int[]{subArrIndexLeft,subArrIndexRight};

           }

       public static boolean isOutofOrder(int i, int num, int[] array){
           if(i ==0){
               return num > array[i+1];
           }
           if(i == array.length-1){
              return num < array[i-1];
           }
           return num > array[i+1] || num < array[i-1];
       }




    public static void main(String[] args) {

        int[] array = {1,2,4,7,10,11,7,12,6,7,16,18,19};
       // int[] array = {2,1};

        System.out.println(Arrays.toString(subArraySort(array)));
    }
}
