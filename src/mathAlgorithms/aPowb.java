package mathAlgorithms;//https://leetcode.com/problems/powx-n/

import java.util.Scanner;

public class aPowb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = sc.nextInt();
        System.out.println(aPowerb(a,b));
    }
    public static double aPowerb(double a, int b) // a^b
    {
        double res = 1;
        while (b > 0) {
            if(b%2==1){
                res*=a;
            }
            a= a*a;
            b/=2;
        }
        return res;
    }
}
