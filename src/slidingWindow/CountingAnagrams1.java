package slidingWindow;
// An efficient Java program to count anagrams of a
// pattern in a text.
import java.io.*;
import java.util.*;

class CountingAnagrams1 {
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if(p.length()> s.length()) return result;

        Map<Character , Integer> map = new HashMap<>();
        for(char c : p.toCharArray()){
            map.put(c , map.getOrDefault(c,0)+1);
        }

        int counter = map.size();

        int i =0;
        int j =0;
        int k = p.length();

        while(j< s.length()){

            //calculations
            char c = s.charAt(j);
            if(map.containsKey(c)){
                map.put(c , map.get(c)-1);
                if(map.get(c) == 0) counter-- ;
            }

            if(j-i+1 < k){
                j++;
            }
//            else if(j-i+1 == k){
//
//                //calculation
//                if(counter ==0){
//                    result.add(i);
//                }
//
//                char begin = s.charAt(i);
//                if(map.containsKey(begin)){
//                    map.put(begin, map.get(begin)+1);
//                    if(map.get(begin)>0){
//                        counter ++;
//                    }
//                }
//
//                //slide the window
//                i++;
//                j++;
//            }

 //              j++;

            else if(j-i+1 == k) {

                while (counter == 0) {
                    char tempc = s.charAt(i);
                    if (map.containsKey(tempc)) {
                        map.put(tempc, map.get(tempc) + 1);
                        if (map.get(tempc) > 0) {
                            counter++;
                        }
                    }
                    if (j - i == p.length()) {
                        result.add(i);
                    }
                    i++;
                }
            }
        }
        return result;
    }

    // Driver code
    public static void main(String args[])
    {
        String text = "forxxorfxdofr";
        String word = "for";
        List<Integer> al = findAnagrams(text, word);
        for(Integer a : al){
            System.out.println(a);
        }
    }
}