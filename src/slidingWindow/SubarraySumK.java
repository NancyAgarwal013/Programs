package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1,2,1};
        int n = arr.length;
        int sum =3;
        System.out.println(subarraySum(arr,sum));
    }
    public static int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
