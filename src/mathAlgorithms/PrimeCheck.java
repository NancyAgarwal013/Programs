package mathAlgorithms;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPrime(n));
    }

    public static boolean checkPrime(int n){
        for(int i=2; i<=Math.sqrt(n) ; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}
