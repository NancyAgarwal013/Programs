package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,7,1,5};
        int n =5;
        int p[] = bubbleSort(arr, n);
        for(int i : p){
            System.out.println(i);
        }
    }

    public static int[] bubbleSort(int[] arr, int n){
        for(int i=0;i<n-1;i++) {
             boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp ;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)
                break;
        }
        return arr;
    }
}
