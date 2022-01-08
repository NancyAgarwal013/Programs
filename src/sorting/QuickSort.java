package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = //{4,3,7,1,5};
        {2,0,2,1,1,0};
        int l =0;
        int h = arr.length-1;
         quickSort(arr, l,h);
        printArray(arr);
//        for(int i : p){
//            System.out.println(i);
//        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void quickSort(int[] arr, int l, int h){
        if(l<=h) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition( arr, l, h);
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, h);
        }
    }

    private static int partition(int[] arr, int l, int h) {

        int i = l-1;
        int pivot = arr[h];
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
