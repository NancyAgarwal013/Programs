package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n =5;
        int p[] = selectionSort(arr, n);
        for(int i : p){
            System.out.println(i);
        }
    }

    public static int[] selectionSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]> arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp ;
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }

        return arr;
    }
}
