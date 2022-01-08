package mathAlgorithms;

import java.util.*;

public class ListFactorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> factorList = listFactors(n);
     //   Collections.sort(factorList);
        System.out.println(factorList);
    }
    public static List<Integer> listFactors(int n){
        List<Integer> al = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    al.add(i);
                    if(i!=Math.sqrt(n)){
                        al.add(n/i);
                    }
                }
        }
        //System.out.println( Arrays.sort(new List[]{al}));
        Collections.sort(al);
      return al;
    }
}
