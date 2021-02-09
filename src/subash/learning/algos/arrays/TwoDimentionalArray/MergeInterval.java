package subash.learning.algos.arrays.TwoDimentionalArray;


//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
// and return an array
// of the non-overlapping intervals that cover all the intervals in the input.

import java.util.*;


//Example 1:
//
//        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]
//        Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
//        Example 2:
//
//        Input: intervals = [[1,4],[4,5]]
//        Output: [[1,5]]
//        Explanation: Intervals [1,4] and [4,5] are considered overlapping.
public class MergeInterval {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals){
            int testVal1=  interval[0];

            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            } else {
                int val = merged.getLast()[1];
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);

    }

    public static int[][] merge1(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> merged = new Stack<>();

        for (int[] interval : intervals){
            int testVal1=  interval[0];

            if(merged.isEmpty() || merged.peek()[1] < interval[0]){
                merged.push(interval);
            } else {
                int val = merged.peek()[1];
                merged.peek()[1] = Math.max(merged.peek()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);

    }

    public static int[][] merge2(int[][] intervals) {
      Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
      Stack<int[]> resultStack = new Stack<>();
      for(int[] interval: intervals){
          if(resultStack.isEmpty() || resultStack.peek()[1] < interval[0]){
              resultStack.push(interval);
          } else {
              resultStack.peek()[1] = Math.max(resultStack.peek()[1], interval[0]);
          }
      }
      return resultStack.toArray(new int[resultStack.size()][]);
    }

    public static void main(String[] args) {
        //{1,3},{2,6},{8,10},{15,18}
        int[][] arrayTwoD = new int[][]{{2,6},{1,3},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arrayTwoD)));

    }
}
