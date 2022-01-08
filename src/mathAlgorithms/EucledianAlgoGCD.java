package mathAlgorithms;

public class EucledianAlgoGCD {
    public static void main(String[] args) {
        int a =12, b =18;
        int gcdVal = gcd(a,b);
        System.out.println(gcdVal);
    }
    public static int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
}
