package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Compute1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n =arr.length;
        Stack<Integer> s = new Stack<>();
        int[] arr1 = new int[n*2];
//        int[] ans = new int[n];
//        int j=0;
        int k=0;
        for(int i=(n*2)-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<= arr[i%n]){
                s.pop();
            }
            if(s.isEmpty()){
                arr1[k++]=-1;
            }
            else{
                arr1[k++] =s.peek();
            }
            s.push(arr[i%n]);
        }

        //   Collections.reverse(Arrays.asList(discount));
        int a=0;
        for(int p=arr1.length-1;p>=n;p--) {
            System.out.println(arr1[p]);
        }

    }
}
