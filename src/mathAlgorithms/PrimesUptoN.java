package mathAlgorithms;//https://leetcode.com/problems/count-primes/submissions/

import java.util.*;

public class PrimesUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  findPrimesByBruteForce(n); //bruteForce
        seiveOfEratothenes(n);    //optimal
    }
    public static void findPrimesByBruteForce(int n){
        List<Integer> al = new ArrayList<>();

        // loop till no
        for(int i=2;i<n;i++){
            boolean flag = false;
            // check each no is prime or not...
            for(int j =2;j<=Math.sqrt(i);j++){
                if(i==2)
                    al.add(i);
                else if(i%j == 0){
                    flag = true;
                    break;
                }
            }
            if(flag== false)
                al.add(i);
        }
        System.out.println(al);
    }

    public static void seiveOfEratothenes(int n){
        boolean primes[] = new boolean[n+1]; //n+1 bcoz saare nos chahiye upto n (n included)
        for(int i=0;i<primes.length;i++){
            primes[i] = true;   // initially we take all are true.
        }
        for(int i=2;i<=Math.sqrt(n);i++){ // sqrt(n) eg, n=18 , sq_root(18) = 4,, so till 4 all the factors
                                          // 18 gets marked to false, as agar ek pair 4 k left mai hoga to right mai bhi hoga.
            if(primes[i]){
                //if primes[i] is true,i.e., it is prime then update all its factors to false...
                for(int j= i*i ; j<=n ; j+=i){  //i*i becoz , for eg i=3, i*2= 6 (which is already marked as false , as it is also
                                                // a factor of 2, so why again and again, so i*i , 3*3 = 9 se karenge start false mark karna
                                                // and saare multiples ko karna hai, so next multiple of 3 after 9 is 12 which is (j =j+i (9+3)), so +i after each j
                    primes[j] = false;
                }
            }
        }

        for(int i=2;i<n ;i++){
            if(primes[i])
                System.out.print(i+" ");
        }
    }
}
