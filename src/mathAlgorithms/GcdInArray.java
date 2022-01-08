package mathAlgorithms;//https://leetcode.com/problems/find-greatest-common-divisor-of-array/

import java.util.Arrays;

public class GcdInArray {
    public static void main(String[] args) {
        int nums[] ={2,5,6,9,10};
        System.out.println(findGCD(nums));
    }
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        return gcd(a,b);
    }

    public static int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
}
