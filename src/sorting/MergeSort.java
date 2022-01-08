package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,7,1,5};
        int l =0;
        int h = arr.length-1;
         mergeSort(arr, l,h);
        printArray(arr);
//        for(int i : p){
//            System.out.println(i);
//        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void mergeSort(int[] arr, int l, int h){
        if(l<h) {

            int mid = l + (h - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge2sortedArrays(arr, l, mid, h);
        }
    }

    private static void merge2sortedArrays(int[] arr, int l, int mid, int h) {
        int b[] = new int[arr.length];
        int i=l;
        int j= mid+1;
        int k=l;
        while(i<=mid && j<=h){
            if(arr[i]<arr[j]){
                b[k] = arr[i];
                i++;
            }
            else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i>mid){
            while(j<=h){
                b[k]=arr[j];
                j++;
                k++;
            }
        }
        else{
            while (i<=mid){
                b[k] = arr[i];
                i++;
                k++;
            }
        }

        for(k=l;k<=h;k++){
            arr[k] = b[k];
        }
//        for(int item : arr){
//            System.out.println(item);
//        }
    }
}
