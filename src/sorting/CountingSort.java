package sorting;

public class CountingSort {
    public static void main(String[] args) {
      //  int[] arr = {4,3,7,1,5};
        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's' };
        int n =arr.length;
        char p[] = countingSort(arr, n);
        for(char i : p){
            System.out.print(i+" ");
        }

    }

    private static char[] countingSort(char[] arr, int n) {

        char output[] = new char[n];

        // step 1: make freq array and count freq
        int count[] = new int[256];
        for(int i=0;i<256;i++){
            count[i] =0;
        }

        //count freq
        for(int i=0;i<n;i++){
            ++count[arr[i]];
        }

        // step 2 : calculate cumulative freq
        for(int i=1;i<=255;i++){
            count[i]+=count[i-1];
        }

        //step 3 : find sorted array
        for (int i=n-1;i>=0;i--){
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }

       return output;
    }
}
