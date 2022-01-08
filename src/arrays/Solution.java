package arrays;

import javax.management.RuntimeErrorException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(9);
        a.add(9);
        a.add(6);
//        a.add(8);
//        a.add(7);
//        a.add(6);
//        a.add(4);
        int x = cardPackets(a);
        System.out.println(x);
    }

    public static int cardPackets(List<Integer> cardTypes) {
        int minSum = Integer.MAX_VALUE;
        int p = 0;
        for(int i =2;i<=3;i++){
            // for(int j =0 ; j<cardTypes.size();j++){

            // }
            int x ;
            int sum =0;
            for(int j : cardTypes){
                x = j%i;
                sum +=x;
            }
            minSum = Math.min(minSum,sum);
            p=i;
        }
        return p;

    }
}

/*
public static int cardPackets(List<Integer> cardTypes) {
            int minSum = Integer.MAX_VALUE;
               // int i=2;
                int x ;

                for(int i =2;i<=3;i++){
                     int sum =0;
                    for(int j : cardTypes){
                        if(j%i !=0){
                            int no = ((j/i)+1)*i;
                            x = no%j;
                             sum +=x;
                        }
                }
             minSum = Math.min(minSum,sum);
                }

            return minSum;

    }

 */
