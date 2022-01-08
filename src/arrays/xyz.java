package arrays;

public class xyz {

    // static boolean checkIfUnequal(int i , int x){
    //     String s1 = Integer.toString(i);
    //     int a[] = new int[26];
    //     for(int j=0;j<s1.length();j++){
    //         a[s1.charAt(j) - '0']++;
    //     }
    //     int prod = i*x;
    //     String s2 = Integer.toString(prod);

    //     for(int k=0;k<s2.length();k++){
    //         if((a[s2.charAt(k)-'0'] > 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    static boolean checkIfUnequal(int n, int q)
    {  String s1 = Integer.toString(n);
        int a[] = new int[26];

        for (int i = 0; i < s1.length(); i++)
            a[s1.charAt(i) - '0']++;

        // Calculate corresponding product
        int prod = n * q;
        String s2 = Integer.toString(prod);

        for (int i = 0; i < s2.length(); i++)
        {
            // If yes, return false
            if (a[s2.charAt(i) - '0'] > 0)
                return false;
        }
        // else, return true
        return true;
    }

}
