package arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3;
       int[] nums2 = {2,5,6};
       int n = 3;
       merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a[] = new int[m+n];
        int k=0;
        int i = 0;
        int j = 0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                a[k++] = nums1[i];
                i++;
            }
            else{
                a[k++] = nums2[j];
                j++;
            }
        }

        if(i<m){
            while(i<m){
                a[k++] = nums1[i];
                i++;
            }
        }
        else{
            while(j<n){
                a[k++] = nums2[j];
                j++;
            }
        }

        for(int p=0;p<a.length;p++){
            nums1[p] = a[p];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(nums1));
    }
}
