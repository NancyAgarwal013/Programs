package slidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxOfAllSubarrays {
    public static void main(String[] args) {
            int arr[] = {1, 2, 3, 1, 4 ,5, 2, 3, 6};
            int n = arr.length;
            int k =3;
        ArrayList<Integer> al = max_of_subarrays(arr,n,k);
        //3 3 4 5 5 5 6 -> o/p
        for(Integer a : al){
            System.out.println(a);
        }
    }
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
//        ArrayList<Integer> al = new ArrayList<>();
//        int max = Integer.MIN_VALUE;
//        int i=0,j=0;
//        while(j<n){
//            //calculation
//            max = Math.max(max, arr[j]);
//            if(j-i+1 < k)
//                j++;
//            else if(j-i+1 == k){
//                //cal
//                max = Math.max(max, arr[j]);
//                al.add(max);
//                max = Integer.MIN_VALUE;
//                //slide window
//                i++;
//                j=i;
//            }
//        }
//        return al;

        //approach 2
        ArrayList<Integer> al = new ArrayList<>();
        Deque<Integer> de = new LinkedList<>();
        int i=0,j=0;
        int max = Integer.MIN_VALUE;
        if(k> arr.length){
            for(int p : arr){
                max = Math.max(max, p);
            }
            //return max element from the input array
            al.add(max);
            return al;
        }
        while(j<n){
            //calculation
            while(de.size()>0 && de.peekLast() < arr[j]){
                de.removeLast();
            }
            de.addLast(arr[j]);

            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k){
                //cal
                al.add(de.peek());
                //slide window
                if(de.peek() == arr[i]){
                    de.removeFirst();
                }
                i++;
                j++;
            }
        }
        return al;
    }
}
