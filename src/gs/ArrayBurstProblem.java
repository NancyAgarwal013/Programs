package gs;

import java.util.ArrayList;
import java.util.List;

public class ArrayBurstProblem {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(8);
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("c");
        ls.add("c");
        ls.add("d");
        ls.add("e");
        ls.add("e");
        int burstLength = 3;
        ls = getShrunkArray(ls,burstLength);
        System.out.println(ls);

    }
    public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {
        int i = 0;
        while (i < inputArray.size()) {
            if (i < 0)
                i = 0;
            int count = 1, j = i+1;
            while (j < inputArray.size() && inputArray.get(j).equals(inputArray.get(i))) {
                count++;
                j++;
            }
            if (i < inputArray.size() && count >= burstLength) {
                while (count > 0) {
                    inputArray.remove(i);
                    count-- ;
                }
                i-=3;
            }
            i++;
        }
        return inputArray;
    }
}
