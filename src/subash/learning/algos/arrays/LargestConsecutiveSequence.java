package subash.learning.algos.arrays;

import java.util.HashSet;

public class LargestConsecutiveSequence {

 //   O(n) time complexity
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);

        int result = 0;

        //100,101,99, 4, 200, 1, 3, 2
        for(int num: nums){
            int count = 1;

            int down = num-1;
            while(set.contains(down)){
                set.remove(down);
                down--;
                count++;
            }

            int up = num+1;
            while(set.contains(up)){
                set.remove(up);
                up++;
                count++;
            }

            result = Math.max(result, count);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {100,101,99, 4, 200, 1, 3, 2};
        //expected result =4 because longest sequence is 1,2,3,4 and is of length 4.
        System.out.println(longestConsecutive(nums));
    }
}
