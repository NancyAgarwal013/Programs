//https://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space/
package arrays;

import java.util.Arrays;

public class Merge2SortedArraysWithoutExtraSpace {

    static int arr1[] = new int[]{1, 5, 9, 10, 15, 20}; //size m
    static int arr2[] = new int[]{2, 3, 8, 13}; // size n

    public static void main(String[] args) {
        merge(arr1.length,arr2.length);
        System.out.print("After Merging nFirst Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(int m, int n) {

        for(int i = n-1;i>=0;i--){
            int last = arr1[m-1];
            int j;
            for(j=m-2; j>=0 && arr1[j]> arr2[i] ; j--){
                arr1[j+1] = arr1[j];
            }
            if(j!=m-2 || last>arr2[i]){
                arr1[j+1] =arr2[i];
                arr2[i] = last;
            }
        }
    }
}
