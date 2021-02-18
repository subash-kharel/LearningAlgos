package subash.learning.algos.arrays.TwoDimentionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MergeInterval1 {

        public static int[][] mergeArrayWithOverLappingRange(int[][] ranges){
            Arrays.sort(ranges, (x,y)->Integer.compare(x[0],y[0]));
            //sorted: [[1,3],[2,6],[7,9],[]13,15]
            List<int[]> arrList = new ArrayList<>();
            for(int i =0; i<ranges.length; i++){
                if(arrList.isEmpty() || arrList.get(arrList.size()-1)[1] < ranges[i][0]){
                    arrList.add(ranges[i]);
                } else {
                    arrList.get(i-1)[1] = Math.max(arrList.get(i-1)[1], ranges[i][1]);
                }
            }
            return arrList.toArray(new int [arrList.size()][]);
        }

    public static int[][] mergeArrayWithOverLappingRange1(int[][] ranges){
            Arrays.sort(ranges, (x,y)->Integer.compare(x[0],y[0]));
            Stack<int[]> result = new Stack<>();
            for(int[] range: ranges){
                if(result.isEmpty() || result.peek()[1] < range[0]){
                    result.push(range);
                } else {
                    result.peek()[1] = Math.max(result.peek()[1], range[1]);
                }
            }
            return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {

            int[][]  inputArrayOfRanges = new int[][]{{2,6},{1,2},{13,15},{7,9}};
        System.out.println(Arrays.deepToString(mergeArrayWithOverLappingRange(inputArrayOfRanges)));
        System.out.println(Arrays.deepToString(mergeArrayWithOverLappingRange1(inputArrayOfRanges)));

    }
}
