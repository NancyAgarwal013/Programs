package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
//
//    public static String minWindow(String s, String t) {
//        String p ="";
//        Map<Character , Integer> mp = new HashMap<>();
//        int i=0,j=0,start=0;
//        int min = Integer.MAX_VALUE;
//        for(int k=0;k<t.length();k++){
//            mp.put(t.charAt(k) , mp.getOrDefault(t.charAt(k),0)+1);
//        }
//        int c = mp.size();
//        while(j<s.length()){
//
//            if(c > 0){
//                if(mp.containsKey(s.charAt(j))){
//                    mp.put(s.charAt(j) , mp.get(s.charAt(j))-1);
//                    if(mp.get(s.charAt(j))==0){
//                        c--;
//                    }
//                }
//                j++;
//            }
//
//             if(c==0){
//                min = Math.min(min , j-i+1);
//                start =i;
//                while(c==0){
//                    if(mp.containsKey(s.charAt(i))){
//                        mp.put(s.charAt(i) , mp.get(s.charAt(i))+1);
//                        if(mp.get(s.charAt(i))==1){
//                            c++;
//                        }
//                    }
//                    i++;
//                    min = Math.min(min , j-i+1);
//                    start = i;
//                }
//            }
//
//        }
////        if(min!=Integer.MAX_VALUE)
////            return p+s.substring(i,min);
////        else
////            return p;
//        String ans="";
//        if(min != Integer.MAX_VALUE){
//            for(int x=start; x<start+min;x++){
//                ans+=s.charAt(x);
//            }
//            return ans;
//        }
//        return "-1";
//    }

    public static String minWindow(String s, String t) {
        String p ="";
        Map<Character , Integer> mp = new HashMap<>();
        int i=0,j=0,start=0;
        int min = Integer.MAX_VALUE;
        for(int k=0;k<t.length();k++){
            mp.put(t.charAt(k) , mp.getOrDefault(t.charAt(k),0)+1);
        }
        int c = mp.size();
        while(j<s.length()){
            if(mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j) , mp.get(s.charAt(j))-1);
                if(mp.get(s.charAt(j))==0){
                    c--;
                }
            }
            //    j++;

            if(c==0){
                //  min = Math.min(min , j-i+1);
                while(c==0){
                    if(mp.containsKey(s.charAt(i))){
                        mp.put(s.charAt(i) , mp.get(s.charAt(i))+1);
                        if(mp.get(s.charAt(i))==1){
                            c++;
                            if(j-i+1<min){
                                min=j-i+1;
                                start=i;
                            }
                        }
                    }
                    i++;
                    //   min = Math.min(min , j-i+1);
                }
            }
            j++;
        }
        // if(min!=Integer.MAX_VALUE)
        //     return p+s.substring(start,min);
        // else
        //     return p;
        String ans="";
        if(min != Integer.MAX_VALUE){
            for(int x=start; x<start+min;x++){
                ans+=s.charAt(x);
            }
            // return ans;
        }
        return ans ;
    }

    public static void main(String[] args) {
      String s = "ADOBECODEBANC", t = "ABC" ;
      //  String s = "ab", t = "a" ;
        String p = minWindow(s,t);
        System.out.println(p);
    }
}
