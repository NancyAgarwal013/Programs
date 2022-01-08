package sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;

        // Function Call
        radixsort(arr, n);
        print(arr, n);
    }

    private static void print(int[] arr, int n) {
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    private static void radixsort(int[] arr, int n) {

        int max = getmax(arr, n);

        for(int exp=1; max/exp > 0 ; exp*=10 ){
            countingSort(arr,n,exp);
        }

    }

    private static void countingSort(int[] arr, int n, int exp) {
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count,0);
        //freq array
        for(int i=0;i<n;i++){
            ++count[(arr[i]/exp)%10];
        }
        // cummulative freq
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        //sorted array
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            --count[(arr[i]/exp)%10];
        }

        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }

    private static int getmax(int[] arr, int n) {
        int max =0;
        for(int i =0;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}
