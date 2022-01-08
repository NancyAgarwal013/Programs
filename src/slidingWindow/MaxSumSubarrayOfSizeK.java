package slidingWindow;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
 */

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {

        Queue<Long> q = new LinkedList<>();
    }

    public static int maxSumOfAllSubarraysOfSizeK(int[] arr, int k){
        int i =0;
        int j =0;
        int sum =0;
        int maxSum = Integer.MIN_VALUE;

        while(j<arr.length){
            sum += arr[j];

            if(j-i+1 <k){
                j++;
            }

            else if(j-i+1 ==k){
                maxSum = Math.max(maxSum , sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }

}
