package hashMap;

import java.util.HashMap;
import java.util.Map;

//--------------------not working--------------------------
public class LongestDuplicateSubstring {
    public static void main(String[] args) {
        String s = "abcd";
       // String s = "banana";
        System.out.println(longestDupSubstring(s));
    }
    public static String longestDupSubstring(String s) {

        char[] c = s.toCharArray();
        Map<String, Integer> hm = new HashMap<>();

        int l =0;
        int h = s.length();
        int mid = l + (h-l)/2;

        for(int i=0; i<s.length()-(mid-1);i++){
            String p ="";
            for(int j=i; j<i+mid; j++){
                p += s.charAt(j);
            }
            hm.put(p, hm.getOrDefault(p,0)+1);
        }
        for(Map.Entry entry : hm.entrySet()){
            System.out.println(entry.getKey() + "- " + entry.getValue());
        }

        int max = Integer.MIN_VALUE;
        String k ="";
        for(Map.Entry entry : hm.entrySet()){
            if(max < (int)entry.getValue()){
                max =(int) entry.getValue();
                k = max >= 2 ? k+entry.getKey() : "";
                System.out.println("k = "+k);
            }
        }
        return k;
    }
}
