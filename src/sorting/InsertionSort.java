package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,7,1,5};
        int n =5;
        int p[] = insertionSort(arr, n);
        for(int i : p){
            System.out.println(i);
        }
    }

    public static int[] insertionSort(int[] arr, int n){
       for(int i=1;i<n;i++){
           int temp = arr[i];
           int j = i-1;
           while(j>=0 && arr[j]>temp){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = temp;
       }
        return arr;
    }
}
