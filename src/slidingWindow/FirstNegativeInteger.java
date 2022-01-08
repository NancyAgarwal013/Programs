package slidingWindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInteger {

    public static void main(String[] args) {
        long a[] ={12, -1, -7, 8, -15, 30, 16, 28};
        int n = a.length;
        int k =3;
        long[] res = printFirstNegativeInteger(a,n,k);
        System.out.println(Arrays.toString(res));
    }
    public static long[] printFirstNegativeInteger(long A[], int N, int k)
    {
        Queue<Long> q = new LinkedList<>();
        long res[] = new long[N-k+1];  // if n = 8 , k=3 , n-k+1 = 8-3+1 = 6
        // means for 8 size array 6 sliding windows are possible.
        int i =0,j=0,count=0;
        while( j<N){
            //calculation
            if(A[j]<0){
                q.add(A[j]);
            }

            if(j-i+1 <k){
                j++;
            }
            else if( j-i+1 == k){
                //calculation
                if(q.size() ==0){
                    res[count++] =0;
                }
                else{
                    res[count++] = q.peek();
                    if(q.peek() == A[i]){
                        q.poll();
                    }
                }
                i++;
                j++;
                //slide the window
            }
        }
        return res;
    }
}
