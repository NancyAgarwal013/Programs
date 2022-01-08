package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Compute {
    public static void main(String[] args) {
//        String s = "forxxorfxdofr";
//        String p = "forfox ";
//        int CHARACTERS = 256;
//        System.out.println(s.charAt(0) - 'a');
//        System.out.println(CHARACTERS - s.charAt(1));
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : p.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet())
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
//
//        Deque<Integer> de = new LinkedList<>();
//
//        int[] arr = {1,2,3,4,5};
//        int max = Integer.MIN_VALUE;
//        for(int i : arr){
//            max = Math.max(i, max);
//        }
//        System.out.println(max);

//        Map<Character, Integer> mp = new HashMap<>();
//        mp.put('a', 1);
//        mp.put('b',1);
//        int c = mp.size();
//        System.out.println("c before : "+c);
//        mp.put('a',mp.get('a')-1);
//        if(mp.get('a')==0){
//            c--;
//        }
//        System.out.println(c);
//
//
//        List<Integer> l = new ArrayList<>();
//        l.add(1);
//        for(int a : l){
//            System.out.println(a);
//            int p = a%2;
//        }

        String s = "tree";
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c , hm.getOrDefault(c,0)+1);
        }

//        List< Map.Entry<Character, Integer>> list = new LinkedList<>(hm.entrySet());
//        Collections.sort(list, (i1,i2)-> i1.getValue().compareTo(i2.getValue()));


        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());

        // Sort the list using lambda expression
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        HashMap<Character, Integer> temp
                = hm.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        for(Map.Entry<Character, Integer> entry : list){
            System.out.println(entry.getKey()+"- "+entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list){
            sb.append(entry.getKey());
        }
        //return sb.toString();
        //  Map<Character, Integer> mp = new LinkedHashMap<>();
        // for( Map.Entry<Character, Integer> entry : list){
        //     mp.put(entry);
        // }

       // List<List<String>> ls = new ArrayList<List<String>>();

//        java.util.Random rand = new java.util.Random();
//        rand.nextInt(list.size());
        int[] arr = {1,2,1};
        int n =arr.length;
        for(int i=(n*2)-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
