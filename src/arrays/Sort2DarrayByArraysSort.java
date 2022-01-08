package arrays;

import java.util.Arrays;

public class Sort2DarrayByArraysSort {
    public static void main(String[] args) {
        int[][] twoDim = { {1, 2}, {3, 7}, {8, 9}, {4, 2}, {5, 3} };
     //   Arrays.sort(twoDim, (a, b) -> Integer.compare(a[0],b[0]));
        //or
        Arrays.sort(twoDim , (a,b) -> a[0]-b[0]);
        System.out.println(Arrays.deepToString(twoDim));
    }
}

/*
output-->
[[1, 2], [3, 7], [4, 2], [5, 3], [8, 9]]
 */
