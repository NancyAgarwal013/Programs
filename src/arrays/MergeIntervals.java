package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static  int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if(intervals.length == 0 || intervals == null)
            return res.toArray(new int[0][]);

       // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        System.out.println(Arrays.deepToString(intervals));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals) {
            if(i[0] <= end) {
                end = Math.max(end, i[1]);
            }
            else {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] twoDim = { {1, 3}, {2, 6}, {8, 10}, {8,9}, {9, 11}, {15, 18}, {2,4}, {16, 17}} ;
      //  int[][] twoDim = {} ;
        int[][] mergedArray = merge(twoDim);
        System.out.println(Arrays.deepToString(mergedArray));
    }
}


